package com.hfad.gtrain.fragments.exerciseDetail.itemLayouts

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.databinding.SetItemLayoutBinding
import com.hfad.gtrain.models.Set

class SetsItemLayout(context: Context) : RelativeLayout(context) {
    private val binding = SetItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)

    fun fillContent(set: Set) {
        binding.tvReps.text = set.rep.toString()
        binding.tvWeight.text = set.weight.toString()
    }

}