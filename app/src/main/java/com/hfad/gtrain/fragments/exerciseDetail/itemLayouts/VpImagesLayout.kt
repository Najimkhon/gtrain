package com.hfad.gtrain.fragments.exerciseDetail.itemLayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.VpImageItemBinding
import com.squareup.picasso.Picasso

class VpImagesLayout(context: Context):RelativeLayout(context) {
    private val binding = VpImageItemBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var imageUrl: String

    init {
        layoutParams = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
    }

    fun fillContent(currentImageUrl: String){
        imageUrl = currentImageUrl
        println("image url" + currentImageUrl)
        if (imageUrl.isNotEmpty()){
            Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.img_benchpress_1)
                .into(binding.ivImageHolder)
        }
    }
}