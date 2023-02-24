package com.hfad.gtrain.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.relations.ExerciseWithRecords
import com.hfad.gtrain.models.relations.MuscleGroupWithCustomExercises
import com.hfad.gtrain.models.relations.MuscleGroupWithExercises

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM muscleGroup")
    fun getAllMuscleGroup(): LiveData<List<MuscleGroup>>

    @Query("SELECT * FROM exercise")
    fun getAllExercise(): LiveData<List<Exercise>>

    @Query("SELECT * FROM record")
    fun getAllRecord(): LiveData<List<Record>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCustomExercise(customEx: CustomExercise)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMuscleGroup(muscleGroup: MuscleGroup)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExercise(exercise: Exercise)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(record: Record)

    @Query("SELECT * FROM record WHERE date = :date")
    fun getRecord(date: Long): LiveData<Record>

    @Query("SELECT * FROM record WHERE date = :date AND exerciseId = :exerciseId")
    suspend fun getRecordByDate(date: Long,  exerciseId: Int): Record

    @Transaction
    @Query("SELECT * FROM exercise WHERE id = :id")
    fun getExerciseWithRecords(id: Int): LiveData<List<ExerciseWithRecords>>

    @Transaction
    @Query("SELECT * FROM muscleGroup WHERE title = :muscleGroup")
    fun getMuscleGroupWithCustomExercises(muscleGroup: String): LiveData<List<MuscleGroupWithCustomExercises>>

    @Transaction
    @Query("SELECT * FROM muscleGroup WHERE title = :muscleGroup")
    fun getMuscleGroupWithExercises(muscleGroup: String): LiveData<List<MuscleGroupWithExercises>>

    @Delete
    suspend fun deleteCustomExercise(customEx: CustomExercise)

    @Update
    suspend fun updateCustomExercise(customEx: CustomExercise)

    @Update
    suspend fun updateRecord(record: Record)

    @Query("SELECT EXISTS(SELECT * FROM record WHERE date = :date AND exerciseId = :exerciseId)")
    suspend fun isRecordExist(date: Long, exerciseId: Int): Boolean
}