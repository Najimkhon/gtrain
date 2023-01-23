package com.hfad.gtrain.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.relations.ExerciseWithRecords
import com.hfad.gtrain.models.relations.MuscleGroupWithExercises

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM muscleGroup ORDER BY id ASC")
    fun getAllData(): LiveData<List<MuscleGroup>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMuscleGroup(muscleGroup: MuscleGroup)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExercise(exercise: Exercise)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(record: Record)

    @Transaction
    @Query("SELECT * FROM exercise WHERE id = :id")
    fun getExerciseWithRecords(id: Int):LiveData<List<ExerciseWithRecords>>

    @Transaction
    @Query("SELECT * FROM muscleGroup WHERE id = :id")
    fun getMuscleGroupWithExercises(id: Int):LiveData<List<MuscleGroupWithExercises>>



}