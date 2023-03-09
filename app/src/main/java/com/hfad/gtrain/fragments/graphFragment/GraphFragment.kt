package com.hfad.gtrain.fragments.graphFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentGraphBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.RecordAdapter
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.utils.ChartDateFormatter
import com.hfad.gtrain.viewmodels.MainViewmodel
import nl.bryanderidder.themedtogglebuttongroup.ThemedButton


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

        bindObjects()
        setupLogsRecyclerView()
        setupListeners()
        setupLineChart()

        return binding.root
    }

    private fun setupListeners(){
        binding.toggleButton.setOnSelectListener { button: ThemedButton ->
            if(button == binding.btn1){
                binding.rvLogs.visibility = View.GONE
            }else{
                binding.rvLogs.visibility = View.VISIBLE
            }
        }
    }

    private fun bindObjects(){
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner){
            binding.toolbar.tvTitle.text = it[0].exercise.name
        }
    }

    private fun setupLineChart(){
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner){
            val lineDataSet = LineDataSet(lineChartDataSet(it[0].records), "data set")
            val iLineDataSet = ArrayList<ILineDataSet>()
            iLineDataSet.add(lineDataSet)
            val lineData = LineData(iLineDataSet)
            binding.graphBlock.data = lineData
            binding.graphBlock.invalidate()
            lineDataSet.color = ResourcesCompat.getColor(resources, R.color.light_blue, null)
            lineDataSet.setCircleColor(ResourcesCompat.getColor(resources, R.color.light_blue, null))
            lineDataSet.setDrawCircles(true)
            lineDataSet.setDrawCircleHole(true)
            lineDataSet.lineWidth = 3f
            lineDataSet.circleRadius = 1f
            lineDataSet.circleHoleRadius = 1f
            lineDataSet.valueTextSize = 10f
            lineDataSet.valueTextColor = ResourcesCompat.getColor(resources, R.color.light_grey, null)
            binding.graphBlock.xAxis.valueFormatter = ChartDateFormatter()
            binding.graphBlock.xAxis.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
            binding.graphBlock.axisLeft.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
            binding.graphBlock.axisRight.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
            binding.graphBlock.legend.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)

        }
    }

    private fun lineChartDataSet(logs: List<Record>):ArrayList<Entry>{

        val dataSet = ArrayList<Entry>()
        logs.forEach { record ->
            val date = record.date
            record.set.forEach{
                dataSet.add(
                    Entry(
                        (date/1000).toFloat(),
                        it.rep.toFloat()
                    )
                )
            }
        }

        return dataSet
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