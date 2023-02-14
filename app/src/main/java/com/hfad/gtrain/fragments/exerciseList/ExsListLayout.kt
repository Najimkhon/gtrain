package com.hfad.gtrain.fragments.exerciseList

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.ExerciseItemLayoutBinding
import com.hfad.gtrain.models.Exercise
import com.squareup.picasso.Picasso

class ExsListLayout(context: Context, private val listener: OnItemClickListener) :
    RelativeLayout(context) {

    private val binding =
        ExerciseItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)

    fun fillContent(currentExercise: Exercise) {
        binding.tvExTitle.text = currentExercise.name
        binding.tvCalorie.text = currentExercise.calories.toString()
        val imageUri = currentExercise.image[0]
        Picasso.get()
            .load(imageUri)
            .placeholder(R.drawable.img_benchpress_1)
            .into(binding.ivImage)
        binding.cvExercise.setOnClickListener {
            listener.onItemClicked(currentExercise)
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(clickedItem: Exercise)
    }

}