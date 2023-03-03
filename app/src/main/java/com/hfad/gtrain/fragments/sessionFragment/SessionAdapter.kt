package com.hfad.gtrain.fragments.sessionFragment

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.fragments.logList.LogsItemLayout
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.Record

class SessionAdapter(
    val context: Context,
    private val listener: SessionItemLayout.OnItemClickListener
) : RecyclerView.Adapter<SessionAdapter.SessionRecordsViewHolder>() {

    private var recordList = emptyList<Record>()
    private lateinit var exercise: List<Exercise>


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionRecordsViewHolder {
        return SessionRecordsViewHolder(SessionItemLayout(context, listener))
    }

    override fun onBindViewHolder(holder: SessionRecordsViewHolder, position: Int) {
        val record = recordList[position]
        holder.layout.fillContent(record, exercise[position])
    }

    override fun getItemCount(): Int {
        return recordList.size
    }

    fun setData(records: List<Record>, exercises: List<Exercise>) {
        recordList = records.sortedBy { it.date }
        exercise = exercises
        notifyDataSetChanged()
        println("Set data size: " + recordList.size)
    }

    inner class SessionRecordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as SessionItemLayout
    }
}