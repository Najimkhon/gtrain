package com.hfad.gtrain.fragments.exerciseDetail.itemLayouts

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.RecordItemViewBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.SetsAdapter
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.Set
import java.text.SimpleDateFormat
import java.util.*

class RecordItemLayout(context: Context) : RelativeLayout(context) {
    private val binding = RecordItemViewBinding.inflate(LayoutInflater.from(context), this, true)
    private val adapter: SetsAdapter by lazy { SetsAdapter(context) }

    fun fillContent(record: Record) {
        displayFormattedDate(record.date)
        setupRecyclerView(record.set)
        println("Reps in Fill content: " + record.set[0].rep.toString())

    }

    private fun displayFormattedDate(timestamp: Long) {
        val month = SimpleDateFormat("MMM", Locale.US).format(timestamp)
        val day = SimpleDateFormat("dd", Locale.US).format(timestamp)
        val year = SimpleDateFormat("yyyy", Locale.US).format(timestamp)
        binding.tvDay.text = day
        binding.tvMonth.text = month
        binding.tvYear.text = year
    }

    private fun setupRecyclerView(sets: List<Set>) {
        val recyclerView = binding.rvSets
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter.setData(sets)
    }
}