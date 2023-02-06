package com.hfad.gtrain.models

import android.net.Uri
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
    val image: Uri?,
    val videoUrl: String = "",
    val description: String = "",
    val calories: Int=0,
    val muscleGroup: String,
    val sets: Int = 0,
    val reps: List<Int> = emptyList()
    ):Parcelable