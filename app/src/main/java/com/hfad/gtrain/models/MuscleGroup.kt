package com.hfad.gtrain.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "muscleGroup")
@Parcelize
data class MuscleGroup (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val imageUrl: String =""
        ):Parcelable