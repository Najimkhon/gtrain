package com.hfad.gtrain.fragments.graphFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentGraphBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.RecordAdapter
import com.hfad.gtrain.viewmodels.MainViewmodel


class GraphFragment : Fragment() {
    private val args by navArgs<GraphFragmentArgs>()
    private var _binding: FragmentGraphBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()
    private val recordAdapter: RecordAdapter by lazy { RecordAdapter(requireContext()) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGraphBinding.inflate(inflater, container, false)
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner){
            binding.toolbar.tvTitle.text = it[0].exercise.name
        }
        setupLogsRecyclerView()




        return binding.root
    }

    private fun setupLogsRecyclerView() {
        val recyclerView = binding.rvLogs
        recyclerView.adapter = recordAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner) {
            recordAdapter.setData(it[0].records)
        }
    }
}