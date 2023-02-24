package com.hfad.gtrain.fragments.exerciseDetail.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.RecordItemLayout
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.relations.ExerciseWithRecords

class RecordAdapter(
    val context: Context
) : RecyclerView.Adapter<RecordAdapter.RecordsViewHolder>() {

    private var recordList = emptyList<Record>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {
        return RecordsViewHolder(RecordItemLayout(context))
    }

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        val record = recordList[position]
        holder.layout.fillContent(record)
    }

    override fun getItemCount(): Int {
        return recordList.size
    }

    fun setData(exerciseWithRecords: ExerciseWithRecords) {
        recordList = exerciseWithRecords.records
        notifyDataSetChanged()
        println("Set data size: " + recordList.size)
    }

    inner class RecordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as RecordItemLayout
    }
}