package com.hfad.gtrain.fragments.muscleGroupList

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.MuscleGroupItemLayoutBinding
import com.hfad.gtrain.models.MuscleGroup

open class MuscleGroupItemLayout(context: Context, private val listener: OnItemClickListener) :
    RelativeLayout(context) {

    private val binding =
        MuscleGroupItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var muscleGroup: MuscleGroup

    fun fillContent(currentMuscleGr: MuscleGroup, position: Int){
        muscleGroup = currentMuscleGr
        binding.tvCategoryName.text = currentMuscleGr.title
        when(muscleGroup.title){
            "Chest" -> binding.ivBackground.setImageResource(R.drawable.img_chest)
            "Legs" -> binding.ivBackground.setImageResource(R.drawable.img_legs)
            "Shoulders" -> binding.ivBackground.setImageResource(R.drawable.img_shoulders)
            "Biceps" -> binding.ivBackground.setImageResource(R.drawable.img_biceps)
            "Triceps" -> binding.ivBackground.setImageResource(R.drawable.img_triceps)
            "Back" -> binding.ivBackground.setImageResource(R.drawable.img_back)
            "Full Body" -> binding.ivBackground.setImageResource(R.drawable.img_full_body)
            "Core" -> binding.ivBackground.setImageResource(R.drawable.img_abs)
        }
    }

    interface OnItemClickListener
}

