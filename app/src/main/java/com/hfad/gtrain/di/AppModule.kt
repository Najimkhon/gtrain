package com.hfad.gtrain.di

import android.content.Context
import androidx.room.Room
import com.hfad.gtrain.data.ExerciseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideExerciseDatabase(
        @ApplicationContext app: Context
    )= Room.databaseBuilder(
        app,
        ExerciseDatabase::class.java,
        "exercise_database"
    ).build()

    @Singleton
    @Provides
    fun provideExerciseDao(db: ExerciseDatabase) = db.exerciseDao()
}