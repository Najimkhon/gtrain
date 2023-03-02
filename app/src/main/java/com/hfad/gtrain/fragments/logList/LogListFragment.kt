package com.hfad.gtrain.fragments.logList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentLogListBinding
import com.hfad.gtrain.viewmodels.MainViewmodel
import java.text.SimpleDateFormat
import java.util.*

class LogListFragment : Fragment(), LogsItemLayout.OnItemClickListener {

    private var _binding: FragmentLogListBinding? = null
    private val binding get() = _binding!!
    private val adapter: LogsAdapter by lazy { LogsAdapter(requireContext(), this) }
    private val viewModel: MainViewmodel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLogListBinding.inflate(inflater, container, false)
        binding.toolbar.tvTitle.text = "Logs"
        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.rvLogs
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.getLogDays.observe(viewLifecycleOwner) {
            adapter.setData(it)
        }
    }

    override fun onItemClicked(logDate: Long) {
        val action =
            LogListFragmentDirections.actionLogListFragmentToSessionFragment(
                logDate
            )
        findNavController().navigate(action)
    }
}