package com.hfad.gtrain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Set (
    val weight: Int,
    val rep: Int
        ):Parcelable