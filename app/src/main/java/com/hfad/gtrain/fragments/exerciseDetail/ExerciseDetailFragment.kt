package com.hfad.gtrain.fragments.exerciseDetail

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentExerciseDetailBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.RecordAdapter
import com.hfad.gtrain.fragments.exerciseDetail.adapters.VpImagesAdapter
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.Set
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class ExerciseDetailFragment : Fragment(), DatePickerDialog.OnDateSetListener {
    private val args by navArgs<ExerciseDetailFragmentArgs>()
    private var _binding: FragmentExerciseDetailBinding? = null
    private val binding get() = _binding!!
    private val adapter: VpImagesAdapter by lazy { VpImagesAdapter(requireContext()) }
    private val recordAdapter: RecordAdapter by lazy { RecordAdapter(requireContext()) }
    private val viewModel: MainViewmodel by activityViewModels()
    private val calendar = Calendar.getInstance()
    private val formatter = SimpleDateFormat("MMM dd yyyy", Locale.US)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExerciseDetailBinding.inflate(inflater, container, false)

        setupLogsRecyclerView()
        setupViewPager()
        setListeners()
        bindViews()

        return binding.root
    }

    private fun setupLogsRecyclerView() {
        val recyclerView = binding.rvLogs
        recyclerView.adapter = recordAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.getExerciseWithRecords(args.currentExercise.id).observe(viewLifecycleOwner) {
            recordAdapter.setData(it[0].records)
        }
    }

    private fun setListeners() {
        binding.btnPlay.setOnClickListener {
            val action =
                ExerciseDetailFragmentDirections.actionExerciseDetailFragmentToVideoPlayerFragment(
                    args.currentExercise
                )
            findNavController().navigate(action)
        }

        binding.ivCalendar.setOnClickListener {
            DatePickerDialog(
                requireContext(),
                this,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        binding.btnAddRecord.setOnClickListener {
            addRecord()
        }
    }

    private fun bindViews() {
        binding.tvDescription.text = args.currentExercise.description
    }

    private fun setupViewPager() {
        val viewPager = binding.vpImages
        viewPager.adapter = adapter
        adapter.setData(args.currentExercise.image)
    }

    private fun addRecord() {
        val date = calendar.timeInMillis
        val set =
            Set(binding.etWeight.text.toString().toInt(), binding.etReps.text.toString().toInt())
        val exerciseId = args.currentExercise.id
        val newRecord = Record(
            0,
            date,
            exerciseId,
            mutableListOf(set)
        )

        viewLifecycleOwner.lifecycleScope.launch {
            if (viewModel.checkRecordExistence(date, exerciseId)) {
                val currentRecord = viewModel.getRecordByDate(date, exerciseId)
                val sets = currentRecord.set
                sets.add(set)
                val updatedRecord = Record(
                    currentRecord.id,
                    currentRecord.date,
                    currentRecord.exerciseId,
                    sets
                )
                viewModel.updateRecord(updatedRecord)
                Toast.makeText(requireContext(), "Updated", Toast.LENGTH_SHORT).show()
                println("existing record updated!")
            } else {
                viewModel.insertRecord(newRecord)
                Toast.makeText(requireContext(), "Record Created", Toast.LENGTH_SHORT).show()
                println("new record created")
            }
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        calendar.set(year, month, dayOfMonth)
        displayFormattedDate(calendar.timeInMillis)
    }

    private fun displayFormattedDate(timestamp: Long) {
        binding.tvSelectedDate.text = formatter.format(timestamp)
        println("Formatting: $timestamp")
    }
}