package com.hfad.gtrain.fragments.exerciseDetail.itemLayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.RecordItemViewBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.OnActionClicked
import com.hfad.gtrain.fragments.exerciseDetail.adapters.SetsAdapter
import com.hfad.gtrain.models.Record
import github.com.st235.lib_swipetoactionlayout.SwipeAction
import github.com.st235.lib_swipetoactionlayout.SwipeMenuListener
import java.text.SimpleDateFormat
import java.util.*

class RecordItemLayout(context: Context, private val onActionClicked: OnActionClicked, private val  onSetClickedListener: SetsItemLayout.OnSetClickedListener) :
    RelativeLayout(context), SwipeMenuListener, Animation.AnimationListener {
    private val binding = RecordItemViewBinding.inflate(LayoutInflater.from(context), this, true)
    private val adapter: SetsAdapter by lazy { SetsAdapter(context, onSetClickedListener) }
    var position = 0
    val swipeActionLayout = binding.swipeToActionLayout
    private lateinit var currentRecord: Record
    private lateinit var animBlink: Animation


    fun fillContent(record: Record, position: Int) {
        swipeActionLayout.menuListener = this
        displayFormattedDate(record.date)
        setupRecyclerView(record)
        println("Reps in Fill content: " + record.set[0].rep.toString())
        this.position = position
        currentRecord = record
        binding.tvDay.setOnClickListener{
            binding.tvDay.startAnimation(animBlink)
        }
        animBlink = AnimationUtils.loadAnimation(context,
            R.anim.blink);

        // set animation listener
        animBlink.setAnimationListener(this)


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
        val recyclerView = binding.rvSets
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter.setData(record)
    }

    override fun onActionClicked(view: View, action: SwipeAction) {
        Toast.makeText(context, "The item position: $position", Toast.LENGTH_SHORT).show()
        println("pressed at $position")
        onActionClicked(currentRecord, action, position)
        swipeActionLayout.close()
    }

    override fun onClosed(view: View) {
        println("closed")
    }

    override fun onFullyOpened(view: View, quickAction: SwipeAction) {
        TODO("Not yet implemented")
    }

    override fun onOpened(view: View) {
        println("opened")
    }

    interface onItemClickListener {
        fun onItemClicked(record: Record)
    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {

    }

    override fun onAnimationRepeat(animation: Animation?) {

    }
}