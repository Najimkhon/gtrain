package com.hfad.gtrain.fragments.graphFragment


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
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
import com.hfad.gtrain.ui.dialogs.DialogManager
import com.hfad.gtrain.utils.ChartDateFormatter
import com.hfad.gtrain.utils.GraphState
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import nl.bryanderidder.themedtogglebuttongroup.ThemedButton
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class GraphFragment : Fragment(), SetsItemLayout.OnSetClickedListener {
    private val args by navArgs<GraphFragmentArgs>()
    private var _binding: FragmentGraphBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()
    private var graphState: MutableLiveData<GraphState> = MutableLiveData(GraphState.DisplayWeight)
    private lateinit var recyclerView: RecyclerView
    private lateinit var lastSelectedItem: SetsItemLayout
    private var updatedRecordPosition = 0
    private lateinit var updatedRecord: Record
    private val formatter = SimpleDateFormat("MMM dd yyyy", Locale.US)
    private lateinit var btnWeights: ThemedButton

    @Inject
    lateinit var dialogManager: DialogManager

    private val recordAdapter: RecordAdapter by lazy {
        RecordAdapter(requireContext(), { record, action, position ->
            when (action.actionId) {
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
        btnWeights = binding.btnWeights
        bindObjects()
        setupLogsRecyclerView()
        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        binding.toggleButton.setOnSelectListener { button: ThemedButton ->
            when (button) {
                binding.btnWeights -> {
                    graphState.value = GraphState.DisplayWeight
                }
                binding.btnReps -> {
                    graphState.value = GraphState.DisplayReps
                }
                binding.btnPerformance -> {
                    graphState.value = GraphState.DisplayPerformance
                }
            }
        }

        binding.btnUpdateRecord.setOnClickListener {
            if (binding.etWeight.text.isNotEmpty() && binding.etReps.text.isNotEmpty()) {
                updateRecord(updatedRecord)
                closeKeyBoard()
                binding.cvInputDialog.visibility = View.GONE
            } else {
                Toast.makeText(requireContext(), "Fields mustn't be empty!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        binding.btnCancel.setOnClickListener {
            binding.cvInputDialog.visibility = View.GONE
            if (this::lastSelectedItem.isInitialized) {
                lastSelectedItem.normalState()
            }
            closeKeyBoard()
        }
    }

    private fun bindObjects() {
        viewModel.getExerciseWithRecords(args.exerciseId)
        viewModel.exerciseWithRecords.observe(viewLifecycleOwner) {
            binding.toolbar.tvTitle.text = it[0].exercise.name
        }
        graphState.observe(viewLifecycleOwner) { graphState ->
            viewModel.getExerciseWithRecords(args.exerciseId)
            viewModel.exerciseWithRecords.observe(viewLifecycleOwner) {
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

        graphState.observe(viewLifecycleOwner) { graphState ->
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
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        viewModel.getExerciseWithRecords(args.exerciseId)
        viewModel.exerciseWithRecords.observe(viewLifecycleOwner) {
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

    private fun updateRecord(record: Record) {
        record.set[updatedRecordPosition].rep = binding.etReps.text.toString().toInt()
        record.set[updatedRecordPosition].weight = binding.etWeight.text.toString().toInt()
        viewModel.updateRecord(record)
    }

    override fun onSetClicked(record: Record, selectedItemLayout: SetsItemLayout, position: Int) {
        if (this::lastSelectedItem.isInitialized) {
            lastSelectedItem.normalState()
            selectedItemLayout.blinkState()
        }
        openInputDialog()
        binding.etReps.setText(record.set[position].rep.toString())
        binding.etWeight.setText(record.set[position].weight.toString())
        displayFormattedDate(record.date)
        updatedRecordPosition = position
        updatedRecord = record
        lastSelectedItem = selectedItemLayout
    }

    private fun openInputDialog() {
        binding.cvInputDialog.visibility = View.VISIBLE
    }

    private fun displayFormattedDate(timestamp: Long) {
        binding.tvSelectedDate.text = formatter.format(timestamp)
    }

    private fun closeKeyBoard() {
        val view = requireActivity().currentFocus
        if (view != null) {
            val imm =
                requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}