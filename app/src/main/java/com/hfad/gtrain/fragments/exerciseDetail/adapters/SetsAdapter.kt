package com.hfad.gtrain.fragments.exerciseDetail.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.SetsItemLayout
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.Set

class SetsAdapter(
    val context: Context,
    private val onSetClickedListener: SetsItemLayout.OnSetClickedListener
) : RecyclerView.Adapter<SetsAdapter.SetsViewHolder>() {

    private lateinit var record: Record
    private var sets = emptyList<Set>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetsViewHolder {
        return SetsViewHolder(SetsItemLayout(context, onSetClickedListener))
    }

    override fun onBindViewHolder(holder: SetsViewHolder, position: Int) {
        val set = sets[position]
        holder.layout.fillContent(record, position)

    }

    override fun getItemCount(): Int {
        return sets.size
    }

    fun setData(record: Record) {
        sets = record.set
        this.record = record
        notifyDataSetChanged()
    }

    inner class SetsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as SetsItemLayout
    }
}