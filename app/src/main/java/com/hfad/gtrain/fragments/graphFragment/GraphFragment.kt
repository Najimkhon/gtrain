package com.hfad.gtrain.fragments.graphFragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.google.android.material.snackbar.Snackbar
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentGraphBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.RecordAdapter
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.SetsItemLayout
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.utils.ChartDateFormatter
import com.hfad.gtrain.utils.GraphState
import com.hfad.gtrain.viewmodels.MainViewmodel
import nl.bryanderidder.themedtogglebuttongroup.ThemedButton


class GraphFragment : Fragment(), SetsItemLayout.OnSetClickedListener {
    private val args by navArgs<GraphFragmentArgs>()
    private var _binding: FragmentGraphBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()
    private var grState: MutableLiveData<GraphState> = MutableLiveData(GraphState.DisplayWeight)
    private lateinit var recyclerView: RecyclerView
    private lateinit var lastSelectedItem: SetsItemLayout

    private val recordAdapter: RecordAdapter by lazy {
        RecordAdapter(requireContext(), { record, action, position ->
            when (action.actionId) {
                R.id.edit -> println("edit is clicked")
                R.id.delete -> {
                    deleteRecord(record, position)
                }
            }
        }, this)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGraphBinding.inflate(inflater, container, false)

        bindObjects()
        setupLogsRecyclerView()
        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        binding.toggleButton.setOnSelectListener { button: ThemedButton ->
            when (button) {
                binding.btnWeights -> {
                    grState.value = GraphState.DisplayWeight
                }
                binding.btnReps -> {
                    grState.value = GraphState.DisplayReps
                }
                binding.btnPerformance -> {
                    grState.value = GraphState.DisplayPerformance
                }
            }
        }
    }

    private fun bindObjects() {
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner) {
            binding.toolbar.tvTitle.text = it[0].exercise.name
        }
        grState.observe(viewLifecycleOwner) { graphState ->
            viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner) {
                setupLineChart(it[0].records, graphState.state)
            }
        }
    }

    private fun setupLineChart(recordList: List<Record>, label: String) {
        val list = recordList.sortedBy { it.date }
        val lineDataSet = LineDataSet(lineChartDataSet(list), label)


        val iLineDataSet = ArrayList<ILineDataSet>()
        iLineDataSet.add(lineDataSet)
        val lineData = LineData(iLineDataSet)
        val chart = binding.graphBlock
        chart.description.text = ""
        chart.data = lineData
        chart.invalidate()
        chart.xAxis.valueFormatter = ChartDateFormatter()
        chart.xAxis.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
        chart.axisLeft.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
        chart.axisRight.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
        chart.legend.textColor = ContextCompat.getColor(requireContext(), R.color.light_grey)
        lineDataSet.color = ResourcesCompat.getColor(resources, R.color.light_blue, null)
        lineDataSet.setCircleColor(ResourcesCompat.getColor(resources, R.color.light_blue, null))
        lineDataSet.setDrawCircles(true)
        lineDataSet.setDrawCircleHole(true)
        lineDataSet.lineWidth = 3f
        lineDataSet.circleRadius = 1f
        lineDataSet.circleHoleRadius = 1f
        lineDataSet.valueTextSize = 10f
        lineDataSet.valueTextColor = ResourcesCompat.getColor(resources, R.color.light_grey, null)
    }

    private fun lineChartDataSet(logs: List<Record>): ArrayList<Entry> {
        val dataSet = ArrayList<Entry>()

        grState.observe(viewLifecycleOwner) { graphState ->
            when (graphState) {
                GraphState.DisplayWeight -> {
                    logs.forEach { record ->
                        val date = record.date
                        record.set.forEach {
                            dataSet.add(
                                Entry(
                                    (date / 1000).toFloat(),
                                    it.weight.toFloat()
                                )
                            )
                        }
                    }
                    binding.tvDescription.text = graphState.description
                }
                GraphState.DisplayReps -> {
                    logs.forEach { record ->
                        val date = record.date
                        record.set.forEach {
                            dataSet.add(
                                Entry(
                                    (date / 1000).toFloat(),
                                    it.rep.toFloat()
                                )
                            )
                        }
                    }
                    binding.tvDescription.text = graphState.description
                }
                GraphState.DisplayPerformance -> {
                    logs.forEach { record ->
                        val date = record.date
                        record.set.forEach {
                            val value = it.rep * it.weight
                            dataSet.add(
                                Entry(
                                    (date / 1000).toFloat(),
                                    value.toFloat()
                                )
                            )
                        }
                    }
                    binding.tvDescription.text = graphState.description
                }
            }
        }

        return dataSet
    }

    private fun setupLogsRecyclerView() {
        recyclerView = binding.rvLogs
        recyclerView.adapter = recordAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner) {
            recordAdapter.setData(it[0].records)
        }

    }

    private fun deleteRecord(record: Record, position: Int) {
        viewModel.deleteRecord(record)
        recordAdapter.notifyItemChanged(position)
        restoreDeletedData(binding.root, record, position)
        recordAdapter.notifyItemChanged(position)
    }

    private fun restoreDeletedData(view: View, deletedItem: Record, position: Int) {
        val snackbar = Snackbar.make(
            view,
            "You deleted a record",
            Snackbar.LENGTH_LONG
        )
        snackbar.setAction("Undo") {
            viewModel.insertRecord(deletedItem)
            recordAdapter.notifyItemChanged(position)
        }
        snackbar.show()
    }

    override fun onSetClicked(record: Record, selectedItemLayout: SetsItemLayout) {
        if (this::lastSelectedItem.isInitialized) {
            lastSelectedItem.normalState()
            selectedItemLayout.blinkState()
        }

        lastSelectedItem = selectedItemLayout
        println("open bottom dialog")

    }

}