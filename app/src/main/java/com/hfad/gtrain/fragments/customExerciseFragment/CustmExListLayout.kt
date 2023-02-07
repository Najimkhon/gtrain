package com.hfad.gtrain.fragments.customExerciseFragment

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.CustomExerciseItemLayoutBinding
import com.hfad.gtrain.databinding.ExerciseItemLayoutBinding
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.models.Exercise
import com.squareup.picasso.Picasso

class CustomExListLayout(context: Context, private val listener: OnItemClickListener) :
    RelativeLayout(context) {

    private val binding =
        CustomExerciseItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var currentExercise: CustomExercise

    init {
        binding.cvExercise.setOnClickListener {
            listener.onItemClicked(currentExercise)
        }
    }

    fun fillContent(currentExercise: CustomExercise) {
        binding.tvExTitle.text = currentExercise.name
        binding.tvCalorie.text = currentExercise.calories.toString()
        val imageUri = currentExercise.image
        Picasso.get()
            .load(imageUri)
            .placeholder(R.drawable.img_benchpress_1)
            .into(binding.ivImage)
    }

    interface OnItemClickListener {
        fun onItemClicked(clickedItem: CustomExercise)
    }

}