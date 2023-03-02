package com.hfad.gtrain.fragments.sessionFragment

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.SessionRecordItemViewBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.SetsAdapter
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.Set
import java.text.SimpleDateFormat
import java.util.*

class SessionItemLayout(context: Context) : RelativeLayout(context) {
    private val binding = SessionRecordItemViewBinding.inflate(LayoutInflater.from(context), this, true)
    private val adapter: SetsAdapter by lazy { SetsAdapter(context) }

    fun fillContent(record: Record, exercise: Exercise) {
        binding.tvExerciseName.text = exercise.name
        val sets = record.set
        var weights = ""
        sets.forEach{
            weights = weights + " " + it.weight + " |"
        }
        binding.tvWeight.text = weights.dropLast(1)
        var reps = ""
        sets.forEach{
            reps = reps + " " + it.rep + " |"
        }
        binding.tvReps.text = reps.dropLast(1)
    }




}