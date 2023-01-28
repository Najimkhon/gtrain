package com.hfad.gtrain.fragments.exerciseList

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.databinding.ExerciseItemLayoutBinding
import com.hfad.gtrain.models.Exercise

class ExsListLayout(context: Context, private val listener: OnItemClickListener) :
    RelativeLayout(context) {

    private val binding =
        ExerciseItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var currentExercise: Exercise

    init {
        binding.cvExercise.setOnClickListener {
            listener.onItemClicked(currentExercise)
        }
    }

    fun fillContent(currentExercise: Exercise) {
        binding.tvExTitle.text = currentExercise.name
        binding.tvCalorie.text = currentExercise.calories.toString()
    }

    interface OnItemClickListener {
        fun onItemClicked(clickedItem: Exercise)
    }

}