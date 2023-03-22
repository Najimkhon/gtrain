package com.hfad.gtrain.fragments.customExerciseFragment

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.models.CustomExercise
import github.com.st235.lib_swipetoactionlayout.SwipeAction

typealias OnActionClicked = (customExercise: CustomExercise, action: SwipeAction, position: Int) -> Unit

class CustomExerciseAdapter(
    val context: Context,
    private val listener: CustomExListLayout.OnItemClickListener,
    private val onActionClicked: OnActionClicked
) : RecyclerView.Adapter<CustomExerciseAdapter.CustomExerciseViewHolder>() {

    var customExList = emptyList<CustomExercise>()
    var item: CustomExercise? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomExerciseViewHolder {
        return CustomExerciseViewHolder(CustomExListLayout(context, listener, onActionClicked))
    }

    override fun onBindViewHolder(holder: CustomExerciseViewHolder, position: Int) {
        val customExercise = customExList[position]
        item = customExercise
        holder.layout.fillContent(customExercise, position)
    }

    override fun getItemCount(): Int {
        return customExList.size
    }

    fun setData(customExerciseList: List<CustomExercise>) {
        this.customExList = customExerciseList
        notifyDataSetChanged()
    }


    inner class CustomExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout = itemView as CustomExListLayout
    }
}

