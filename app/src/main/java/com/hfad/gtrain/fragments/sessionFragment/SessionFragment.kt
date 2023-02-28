package com.hfad.gtrain.fragments.sessionFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentSessionBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.RecordAdapter
import com.hfad.gtrain.viewmodels.MainViewmodel
import java.text.SimpleDateFormat
import java.util.*


class SessionFragment : Fragment() {

    private val args by navArgs<SessionFragmentArgs>()
    private var _binding: FragmentSessionBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()
    private val recordAdapter: RecordAdapter by lazy { RecordAdapter(requireContext()) }
    private val formatter = SimpleDateFormat("MMM dd yyyy, hh:mm:ss.SSS", Locale.US)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSessionBinding.inflate(inflater, container, false)
        binding.tvTest.text = formatter.format(args.logDate)

        setupLogsRecyclerView()

        return binding.root

    }

    private fun setupLogsRecyclerView() {
        val recyclerView = binding.rvLogs
        recyclerView.adapter = recordAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        viewModel.getAllRecordsByDate(args.logDate).observe(viewLifecycleOwner){
//            recordAdapter.setData(it)
//        }
        viewModel.getRecordListByDay(args.logDate).observe(viewLifecycleOwner) {
            recordAdapter.setData(it)
            println("The testing size:" + it.size)
        }
    }


}