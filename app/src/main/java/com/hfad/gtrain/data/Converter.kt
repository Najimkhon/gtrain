package com.hfad.gtrain.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.hfad.gtrain.models.Set


class Converter {


    @TypeConverter
    fun setListtoJson(setList: List<Set>?):String{
        return  Gson().toJson(setList)
    }

    @TypeConverter
    fun jsonToSetList(setList: String):List<Set>{
        return Gson().fromJson(setList, Array<Set>::class.java).toList()
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

