package com.hfad.gtrain.fragments.muscleGroupList

import android.content.Context
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.hfad.gtrain.databinding.MuscleGroupItemLayoutBinding

class MuscleGroupItemLayout(context: Context, private val listener: OnItemClickListener) :
    ConstraintLayout(context) {

    private val binding =
        MuscleGroupItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)


}

interface OnItemClickListener {

}