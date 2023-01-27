package com.hfad.gtrain.fragments.muscleGroupList

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.models.MuscleGroup


class MuscleGroupAdapter(val context: Context, private val listener: OnItemClickListener) :
    RecyclerView.Adapter<MuscleGroupAdapter.MuscleGroupViewHolder>() {

    private var muscleGroupList = emptyList<MuscleGroup>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuscleGroupViewHolder {
        return MuscleGroupViewHolder(MuscleGroupItemLayout(context, listener))
    }

    override fun onBindViewHolder(holder: MuscleGroupViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return muscleGroupList.size
    }

    inner class MuscleGroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as MuscleGroupItemLayout
    }
}