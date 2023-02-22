package com.hfad.gtrain.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Record (
    @PrimaryKey(autoGenerate = true)
    val date: Long,
    val exerciseId: Int,
    val set: List<Set>
        ):Parcelable