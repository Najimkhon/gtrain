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

    @TypeConverter
    fun stringListToJson(list: List<String>):String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun jsonToStringList(list: String):List<String>{
        return Gson().fromJson(list, Array<String>::class.java).toList()
    }
}

