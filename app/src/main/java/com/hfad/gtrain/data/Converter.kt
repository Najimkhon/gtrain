package com.hfad.gtrain.data

import android.net.Uri
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.hfad.gtrain.models.Set


class Converter {


    @TypeConverter
    fun setListtoJson(setList: MutableList<Set>?):String{
        return  Gson().toJson(setList)
    }

    @TypeConverter
    fun jsonToSetList(setList: String):MutableList<Set>{
        return Gson().fromJson(setList, Array<Set>::class.java).toMutableList()
    }

    //converter for uri
    @TypeConverter
    fun fromString(value: String?): Uri? {
        return if (value == null) null else Uri.parse(value)
    }

    @TypeConverter
    fun toString(uri: Uri?): String? {
        return uri?.toString()
    }


    // converter for image url list
    @TypeConverter
    fun stringListToJson(list: List<String>):String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun jsonToStringList(list: String):List<String>{
        return Gson().fromJson(list, Array<String>::class.java).toList()
    }

    //converter for reps list
    @TypeConverter
    fun intListToJson(list: List<Int>):String{
        return Gson().toJson(list)
    }
    @TypeConverter
    fun jsonToIntList(list: String):List<Int>{
        return Gson().fromJson(list, Array<Int>::class.java).toList()
    }
}

