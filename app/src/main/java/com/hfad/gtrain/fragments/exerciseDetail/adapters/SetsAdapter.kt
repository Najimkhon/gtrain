package com.hfad.gtrain.fragments.exerciseDetail.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.SetsItemLayout
import com.hfad.gtrain.models.Set

class SetsAdapter(
    val context: Context
) : RecyclerView.Adapter<SetsAdapter.SetsViewHolder>() {

    private var sets = emptyList<Set>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetsViewHolder {
        return SetsViewHolder(SetsItemLayout(context))
    }

    override fun onBindViewHolder(holder: SetsViewHolder, position: Int) {
        val set = sets[position]
        holder.layout.fillContent(set)

    }

    override fun getItemCount(): Int {
        return sets.size
    }

    fun setData(setList: List<Set>) {
        sets = setList
        notifyDataSetChanged()
    }

    inner class SetsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as SetsItemLayout
    }
}