package com.hfad.gtrain.fragments.logList

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.databinding.FragmentLogListBinding
import com.hfad.gtrain.viewmodels.MainViewModel

class LogListFragment : BaseFragment<FragmentLogListBinding>(FragmentLogListBinding::inflate),
    LogsItemLayout.OnItemClickListener {

    private val adapter: LogsAdapter by lazy { LogsAdapter(requireContext(), this) }
    private val viewModel: MainViewModel by activityViewModels()

    override fun prepareUI() {
        binding.toolbar.tvTitle.text = "Logs"
        binding.rvLogs.apply {
            adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    override fun setObservers() {
        viewModel.getLogDays.observe(viewLifecycleOwner) {
            adapter.setData(it)
        }
    }

    override fun onItemClicked(logDate: Long) {
        val action = LogListFragmentDirections.actionLogListFragmentToSessionFragment(
            logDate
        )
        findNavController().navigate(action)
    }
}