package com.hfad.gtrain.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.hfad.gtrain.models.Rep


class Converter {

    @TypeConverter
    fun listToJson(reps: ArrayList<Rep>?)=Gson().toJson(reps)

    @TypeConverter
    fun jsonToList(reps: String) = Gson().fromJson(reps, Array<Rep>::class.java).toList()
}