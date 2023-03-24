package com.hfad.gtrain.fragments.sessionFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentSessionBinding
import com.hfad.gtrain.viewmodels.MainViewModel
import java.text.SimpleDateFormat
import java.util.*


class SessionFragment : Fragment(), SessionItemLayout.OnItemClickListener {

    private val args by navArgs<SessionFragmentArgs>()
    private var _binding: FragmentSessionBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()
    private val recordAdapter: SessionAdapter by lazy { SessionAdapter(requireContext(), this) }
    private val formatter = SimpleDateFormat("MMM d", Locale.US)
    private val sessionDate = args.logDate

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSessionBinding.inflate(inflater, container, false)
        binding.toolbar.tvTitle.text = formatter.format(args.logDate)
        setupLogsRecyclerView()

        return binding.root

    }

    private fun setupLogsRecyclerView() {
        val recyclerView = binding.rvLogs
        recyclerView.adapter = recordAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())


//        viewModel.getRecordListByDay(args.logDate).observe(viewLifecycleOwner) { recordList ->
//            viewModel.getAllExercise.observe(viewLifecycleOwner) { exerciseList ->
//                recordAdapter.setData(recordList, exerciseList)
//            }
//        }

        viewModel.getRecordListByDay(sessionDate)

        viewModel.recordListByDay.observe(viewLifecycleOwner) { recordList ->
            viewModel.getAllExercise.observe(viewLifecycleOwner) { exerciseList ->
                recordAdapter.setData(recordList, exerciseList)
            }
        }
    }

    override fun onItemClicked(exerciseId: Int) {
        val action =
            SessionFragmentDirections.actionSessionFragmentToGraphFragment(exerciseId)
        findNavController().navigate(action)
    }


}