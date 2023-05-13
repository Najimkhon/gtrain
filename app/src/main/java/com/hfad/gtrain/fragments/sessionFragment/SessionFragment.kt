package com.hfad.gtrain.fragments.sessionFragment

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.databinding.FragmentSessionBinding
import com.hfad.gtrain.viewmodels.MainViewModel
import java.text.SimpleDateFormat
import java.util.*


class SessionFragment : BaseFragment<FragmentSessionBinding>(FragmentSessionBinding::inflate),
    SessionItemLayout.OnItemClickListener {

    private val args by navArgs<SessionFragmentArgs>()
    private val viewModel: MainViewModel by activityViewModels()
    private val recordAdapter: SessionAdapter by lazy { SessionAdapter(requireContext(), this) }
    private val formatter = SimpleDateFormat("MMM d", Locale.US)

    override fun prepareUI() {
        binding.toolbar.tvTitle.text = formatter.format(args.logDate)
        binding.rvLogs.apply {
            adapter = recordAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    override fun setObservers() {
        viewModel.getRecordListByDay(args.logDate)
        viewModel.recordListByDay.observe(viewLifecycleOwner) { recordList ->
            viewModel.getAllExercise.observe(viewLifecycleOwner) { exerciseList ->
                recordAdapter.setData(recordList, exerciseList)
            }
        }
    }

    override fun onItemClicked(exerciseId: Int) {
        val action = SessionFragmentDirections.actionSessionFragmentToGraphFragment(exerciseId)
        findNavController().navigate(action)
    }
}