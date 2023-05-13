package com.hfad.gtrain.fragments.exerciseDetail

import android.app.DatePickerDialog
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.DatePicker
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.hfad.gtrain.R
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.databinding.FragmentExerciseDetailBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.RecordAdapter
import com.hfad.gtrain.fragments.exerciseDetail.adapters.VpImagesAdapter
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.SetsItemLayout
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.Set
import com.hfad.gtrain.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class ExerciseDetailFragment :
    BaseFragment<FragmentExerciseDetailBinding>(FragmentExerciseDetailBinding::inflate),
    DatePickerDialog.OnDateSetListener, SetsItemLayout.OnSetClickedListener {
    private val args by navArgs<ExerciseDetailFragmentArgs>()
    private val vpAdapter: VpImagesAdapter by lazy { VpImagesAdapter(requireContext()) }
    private val viewModel: MainViewModel by activityViewModels()
    private var calendar = Calendar.getInstance()
    private val formatter = SimpleDateFormat("MMM dd yyyy", Locale.US)
    private lateinit var lastSelectedItem: SetsItemLayout
    private lateinit var updatedRecord: Record
    private var updatedRecordPosition = 0

    private val recordAdapter: RecordAdapter by lazy {
        RecordAdapter(requireContext(), { record, action, position ->
            when (action.actionId) {
                R.id.delete -> {
                    deleteRecord(record, position)
                }
            }
        }, this)
    }

    override fun setListeners() {
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
            if (binding.etWeight.text.isNotEmpty() && binding.etReps.text.isNotEmpty()) {
                addRecord()
                closeKeyBoard()
                closeInputDialog()
            } else {
                Toast.makeText(requireContext(), "Fields mustn't be empty!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.btnUpdateRecord.setOnClickListener {
            if (binding.etWeight.text.isNotEmpty() && binding.etReps.text.isNotEmpty()) {
                updateRecord(updatedRecord)
                defaultMode()
                closeKeyBoard()
                closeInputDialog()
            } else {
                Toast.makeText(requireContext(), "Fields mustn't be empty!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.fabAdd.setOnClickListener {
            openInputDialog()
        }

        binding.btnCancel.setOnClickListener {
            closeInputDialog()
            if (this::lastSelectedItem.isInitialized) {
                lastSelectedItem.normalState()
            }
            defaultMode()
            closeKeyBoard()

        }
    }

    override fun prepareUI() {
        binding.tvDescription.text = args.currentExercise.description
        binding.vpImages.apply {
            adapter = vpAdapter
            vpAdapter.setData(args.currentExercise.image)
        }

        binding.rvLogs.apply {
            adapter = recordAdapter
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        }
    }

    override fun setObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getExerciseWithRecords(args.currentExercise.id)
            viewModel.exerciseWithRecords.observe(viewLifecycleOwner) {
                recordAdapter.setData(it[0].records)
            }
        }
    }

    private fun updateRecord(record: Record) {
        record.set[updatedRecordPosition].rep = binding.etReps.text.toString().toInt()
        record.set[updatedRecordPosition].weight = binding.etWeight.text.toString().toInt()
        viewModel.updateRecord(record)
    }

    private fun addRecord() {
        val date = calendar.timeInMillis
        val set =
            Set(binding.etWeight.text.toString().toInt(), binding.etReps.text.toString().toInt())
        val exerciseId = args.currentExercise.id
        viewModel.addRecord(date, exerciseId, set)
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        calendar.set(year, month, dayOfMonth)
        displayFormattedDate(calendar.timeInMillis)
    }

    private fun displayFormattedDate(timestamp: Long) {
        binding.tvSelectedDate.text = formatter.format(timestamp)
    }

    private fun deleteRecord(record: Record, position: Int) {
        viewModel.deleteRecord(record)
        recordAdapter.notifyItemChanged(position)
        restoreDeletedData(binding.root, record, position)
        recordAdapter.notifyItemChanged(position)
    }

    private fun restoreDeletedData(view: View, deletedItem: Record, position: Int) {
        val snackbar = Snackbar.make(
            view, "You deleted a record", Snackbar.LENGTH_LONG
        )
        snackbar.setAction("Undo") {
            viewModel.insertRecord(deletedItem)
            recordAdapter.notifyItemChanged(position)
        }
        snackbar.show()
    }

    override fun onSetClicked(record: Record, selectedItemLayout: SetsItemLayout, position: Int) {
        if (this::lastSelectedItem.isInitialized) {
            lastSelectedItem.normalState()
            selectedItemLayout.blinkState()
        }
        openInputDialog()
        updateMode()
        binding.etReps.setText(record.set[position].rep.toString())
        binding.etWeight.setText(record.set[position].weight.toString())
        displayFormattedDate(record.date)
        updatedRecordPosition = position
        updatedRecord = record
        lastSelectedItem = selectedItemLayout
    }

    private fun updateMode() {
        binding.btnUpdateRecord.visibility = View.VISIBLE
        binding.btnAddRecord.visibility = View.GONE
    }

    private fun defaultMode() {
        binding.btnUpdateRecord.visibility = View.GONE
        binding.btnAddRecord.visibility = View.VISIBLE
        lastSelectedItem.normalState()
    }

    private fun closeKeyBoard() {
        val view = requireActivity().currentFocus
        if (view != null) {
            val imm =
                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun openInputDialog() {
        binding.cvInputDialog.visibility = View.VISIBLE
        binding.fabAdd.visibility = View.GONE
    }

    private fun closeInputDialog() {
        binding.cvInputDialog.visibility = View.GONE
        binding.fabAdd.visibility = View.VISIBLE
        binding.etReps.setText("")
        binding.etWeight.setText("")
        binding.tvSelectedDate.text = "Today"
        calendar = Calendar.getInstance()
    }
}