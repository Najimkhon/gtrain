package com.hfad.gtrain.fragments.customExerciseFragment

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.models.CustomExercise

class CustomExerciseAdapter(
    val context: Context,
    private val listener: CustomExListLayout.OnItemClickListener
):RecyclerView.Adapter<CustomExerciseAdapter.CustomExerciseViewHolder>() {

    private var customExList = emptyList<CustomExercise>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomExerciseViewHolder {
        return CustomExerciseViewHolder(CustomExListLayout(context, listener))
    }

    override fun onBindViewHolder(holder: CustomExerciseViewHolder, position: Int) {
        val customExercise = customExList[position]
        holder.layout.fillContent(customExercise)
    }

    override fun getItemCount(): Int {
        return customExList.size
    }

    fun setData(customExerciseList: List<CustomExercise>){
        this.customExList = customExerciseList
        notifyDataSetChanged()
    }

    inner class CustomExerciseViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val layout = itemView as CustomExListLayout
    }
}

