package com.hfad.gtrain.fragments.exerciseList

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.relations.MuscleGroupWithExercises

class ExsListAdapter(
    val context: Context,
    private val listener: ExsListLayout.OnItemClickListener
) : RecyclerView.Adapter<ExsListAdapter.ExsListViewHolder>() {

    private var exerciseList = emptyList<Exercise>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExsListViewHolder {
        return ExsListViewHolder(ExsListLayout(context, listener))
    }

    override fun onBindViewHolder(holder: ExsListViewHolder, position: Int) {
        val exercise = exerciseList[position]
        holder.layout.fillContent(exercise)

    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }

    fun setData(exerciseList: List<Exercise>) {
        this.exerciseList = exerciseList
        notifyDataSetChanged()

    }

    inner class ExsListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as ExsListLayout
    }

}
