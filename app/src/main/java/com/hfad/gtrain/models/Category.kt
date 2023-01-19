package com.hfad.gtrain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category (
    val title: String,
    val imageUrl: String ="",
    val exerciseList: ArrayList<Exercise>
        ):Parcelable