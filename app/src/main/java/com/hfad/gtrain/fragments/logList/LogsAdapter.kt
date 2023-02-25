package com.hfad.gtrain.fragments.logList

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LogsAdapter(
    val context: Context
) : RecyclerView.Adapter<LogsAdapter.LogsViewHolder>() {

    private var logDateList = emptyList<Long>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogsViewHolder {
        return LogsViewHolder(LogsItemLayout(context))
    }

    override fun onBindViewHolder(holder: LogsViewHolder, position: Int) {
        val logDate = logDateList[position]
        holder.layout.fillContent(logDate)
    }

    override fun getItemCount(): Int {
        return logDateList.size
    }

    fun setData(logDates: List<Long>) {
        logDateList = logDates
        notifyDataSetChanged()
    }

    inner class LogsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as LogsItemLayout
    }
}