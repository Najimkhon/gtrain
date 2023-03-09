package com.hfad.gtrain.utils

import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class ChartDateFormatter: IndexAxisValueFormatter() {
    override fun getFormattedValue(value: Float): String {
        val dateInMillis = value.toLong() * 1000
        val date = Calendar.getInstance().apply {
            timeInMillis = dateInMillis
        }.time

        return SimpleDateFormat("dd MMM", Locale.getDefault()).format(date)
    }
}