package com.hfad.gtrain.fragments.exerciseDetail.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.RecordItemLayout
import com.hfad.gtrain.models.Record
import github.com.st235.lib_swipetoactionlayout.SwipeAction

typealias OnActionClicked = (record: Record, action: SwipeAction, position: Int) -> Unit

class RecordAdapter(
    val context: Context,
    private val onActionClicked: OnActionClicked
) : RecyclerView.Adapter<RecordAdapter.RecordsViewHolder>() {

    private var recordList = emptyList<Record>()
    lateinit var currentRecord: Record


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {
        return RecordsViewHolder(RecordItemLayout(context, onActionClicked))
    }

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        currentRecord = recordList[position]
        holder.layout.fillContent(currentRecord, position)
    }

    override fun getItemCount(): Int {
        return recordList.size
    }

    fun setData(records: List<Record>) {
        recordList = records.sortedBy { it.date }
        notifyDataSetChanged()
        println("Set data size: " + recordList.size)
    }

    inner class RecordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as RecordItemLayout
    }
}