package com.hfad.gtrain.fragments.exerciseDetail.itemLayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.databinding.RecordItemViewBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.OnActionClicked
import com.hfad.gtrain.fragments.exerciseDetail.adapters.SetsAdapter
import com.hfad.gtrain.models.Record
import github.com.st235.lib_swipetoactionlayout.ActionBindHelper
import github.com.st235.lib_swipetoactionlayout.SwipeAction
import github.com.st235.lib_swipetoactionlayout.SwipeMenuListener
import java.text.SimpleDateFormat
import java.util.*

class RecordItemLayout(
    context: Context,
    private val onActionClicked: OnActionClicked,
    private val onSetClickedListener: SetsItemLayout.OnSetClickedListener
) :
    RelativeLayout(context), SwipeMenuListener {
    private val binding = RecordItemViewBinding.inflate(LayoutInflater.from(context), this, true)
    private val adapter: SetsAdapter by lazy { SetsAdapter(context, onSetClickedListener) }
    var position = 0
    private val swipeActionLayout = binding.swipeToActionLayout
    private lateinit var currentRecord: Record
    lateinit var recyclerView: RecyclerView


    fun fillContent(record: Record, position: Int) {
        swipeActionLayout.menuListener = this
        displayFormattedDate(record.date)
        setupRecyclerView(record)
        this.position = position
        currentRecord = record
    }

    private fun displayFormattedDate(timestamp: Long) {
        val month = SimpleDateFormat("MMM", Locale.US).format(timestamp)
        val day = SimpleDateFormat("dd", Locale.US).format(timestamp)
        val year = SimpleDateFormat("yyyy", Locale.US).format(timestamp)
        binding.tvDay.text = day
        binding.tvMonth.text = month
        binding.tvYear.text = year
    }

    private fun setupRecyclerView(record: Record) {
        recyclerView = binding.rvSets
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter.setData(record)
    }


    override fun onActionClicked(view: View, action: SwipeAction) {
        onActionClicked(currentRecord, action, position)
        swipeActionLayout.close()
    }

    override fun onClosed(view: View) {
    }

    override fun onFullyOpened(view: View, quickAction: SwipeAction) {
    }

    override fun onOpened(view: View) {
    }
}