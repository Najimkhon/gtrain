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

class SessionItemLayout(context: Context, private val listener: OnItemClickListener) : RelativeLayout(context) {
    private val binding = SessionRecordItemViewBinding.inflate(LayoutInflater.from(context), this, true)

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
        binding.tvAvgWeight.text = calculateAvgWeight(record).toString()
        binding.tvAvgReps.text = calculateAvgReps(record).toString()

        binding.itemView.setOnClickListener{
            listener.onItemClicked(record.exerciseId)
        }
    }

    private fun calculateAvgWeight(record: Record):Int{
        val sets = record.set
        var sumOfWeights = 0
        var sumOfReps = 0
        sets.forEach{
            sumOfWeights += it.weight
            sumOfReps += it.rep
        }
        return sumOfWeights/sets.size
    }
    private fun calculateAvgReps(record: Record):Int{
        val sets = record.set
        var sumOfReps = 0
        sets.forEach{
            sumOfReps += it.rep
        }
        return sumOfReps/sets.size
    }

    interface OnItemClickListener {
        fun onItemClicked(exerciseId: Int)
    }

}