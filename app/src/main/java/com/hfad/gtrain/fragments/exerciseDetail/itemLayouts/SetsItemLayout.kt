package com.hfad.gtrain.fragments.exerciseDetail.itemLayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.SetItemLayoutBinding
import com.hfad.gtrain.models.Record

class SetsItemLayout(context: Context, private val listener: OnSetClickedListener) : RelativeLayout(context), Animation.AnimationListener {
    private val binding = SetItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var animBlink: Animation

    fun fillContent(record: Record, position: Int) {
        binding.tvReps.text = record.set[position].rep.toString()
        binding.tvWeight.text = record.set[position].weight.toString()

        animBlink = AnimationUtils.loadAnimation(context,
            R.anim.blink)
        // set animation listener
        animBlink.setAnimationListener(this)

        binding.tvReps.setOnClickListener{
            listener.onSetClicked(record, this)
            blinkState()

        }

        binding.tvWeight.setOnClickListener{
            listener.onSetClicked(record, this)
            blinkState()
        }
    }

    fun blinkState(){
        binding.tvReps.startAnimation(animBlink)
        binding.tvWeight.startAnimation(animBlink)
    }

    fun normalState(){
        binding.tvReps.clearAnimation()
        binding.tvWeight.clearAnimation()
    }

    interface OnSetClickedListener{
        fun onSetClicked(record: Record, selectedItemLayout: SetsItemLayout)
    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {

    }

    override fun onAnimationRepeat(animation: Animation?) {

    }

}