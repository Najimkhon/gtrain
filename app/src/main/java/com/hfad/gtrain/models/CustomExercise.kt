package com.hfad.gtrain.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class CustomExercise(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    var image: String = "",
    val videoUrl: String = "",
    val description: String = "",
    var calories: Int = 0,
    val muscleGroup: String,
    var sets: Int = 0,
    var reps: List<Int> = emptyList()
) : Parcelable