package com.hfad.gtrain.models

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val image: String = "",
    val videoUrl: String = "",
    val description: String = "",
    val reps: Int,
    val calories: Int
    ):Parcelable