package com.hfad.gtrain.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
@Entity
@Parcelize
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val image: String = "",
    val videoUrl: String = "",
    val description: String = "",
    val calories: Int,
    val muscleGroupId: Int
    ):Parcelable