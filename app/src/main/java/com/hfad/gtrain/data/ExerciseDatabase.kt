package com.hfad.gtrain.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record

@Database(entities = [MuscleGroup::class, Exercise::class, Record::class],
    version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class ExerciseDatabase : RoomDatabase() {

    abstract fun exerciseDao(): ExerciseDao

    companion object {

        @Volatile
        private var INSTANCE: ExerciseDatabase? = null

        fun getDatabase(context: Context): ExerciseDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ExerciseDatabase::class.java,
                    "exercise_database"
                ).build()
                INSTANCE = instance
                return instance
            }

        }
    }
}