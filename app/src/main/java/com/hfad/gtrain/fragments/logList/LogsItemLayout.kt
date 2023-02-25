package com.hfad.gtrain.fragments.logList

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.databinding.LogsItemLayoutBinding
import java.text.SimpleDateFormat
import java.util.*


class LogsItemLayout(context: Context, private val listener: OnItemClickListener) : RelativeLayout(context) {
    private val binding = LogsItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    private val formatter = SimpleDateFormat("MMM dd yyyy", Locale.US)

    fun fillContent(logDate: Long) {
        binding.tvDate.text = formatter.format(logDate)
        binding.tvDate.setOnClickListener{
            listener.onItemClicked(logDate)
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(logDate: Long)
    }
}
