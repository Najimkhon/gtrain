package com.hfad.gtrain.repositories

import androidx.lifecycle.LiveData
import com.hfad.gtrain.data.ExerciseDao
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.relations.ExerciseWithRecords
import com.hfad.gtrain.models.relations.MuscleGroupWithCustomExercises
import com.hfad.gtrain.models.relations.MuscleGroupWithExercises
import javax.inject.Inject

class RoomRepository @Inject constructor(
    private val exerciseDao: ExerciseDao
) {

    val getAllMuscleGroup: LiveData<List<MuscleGroup>> = exerciseDao.getAllMuscleGroup()
    val getAllExercise: LiveData<List<Exercise>> = exerciseDao.getAllExercise()
    val getLogDays: LiveData<List<Long>> = exerciseDao.getLogDays()

    suspend fun insertMuscleGroup(muscleGroup: MuscleGroup) {
        exerciseDao.insertMuscleGroup(muscleGroup)
    }

    suspend fun insertExercise(exercise: Exercise) {
        exerciseDao.insertExercise(exercise)
    }

    suspend fun insertCustomExercise(customEx: CustomExercise) {
        exerciseDao.insertCustomExercise(customEx)
    }

    suspend fun insertRecord(record: Record) {
        exerciseDao.insertRecord(record)
    }

    suspend fun getMuscleGroupWithExercises(muscleGroup: String): List<MuscleGroupWithExercises> {
        return exerciseDao.getMuscleGroupWithExercises(muscleGroup)
    }

    fun getMuscleGroupWithCustomExercises(muscleGroup: String): List<MuscleGroupWithCustomExercises> {
        return exerciseDao.getMuscleGroupWithCustomExercises(muscleGroup)
    }

    fun getExerciseWithRecords(exerciseId: Int): List<ExerciseWithRecords> {
        return exerciseDao.getExerciseWithRecords(exerciseId)
    }

    suspend fun deleteCustomExercise(customEx: CustomExercise) {
        exerciseDao.deleteCustomExercise(customEx)
    }

    suspend fun deleteRecord(record: Record) {
        exerciseDao.deleteRecord(record)
    }

    suspend fun updateCustomExercise(customEx: CustomExercise) {
        exerciseDao.updateCustomExercise(customEx)
    }

    suspend fun updateRecord(record: Record) {
        exerciseDao.updateRecord(record)
    }

    suspend fun getRecordListByDay(date: Long): List<Record> {
        return exerciseDao.getRecordListByDay(date)
    }

    suspend fun getRecordByDate(date: Long, exerciseId: Int): Record? {
        return exerciseDao.getRecordByDate(date, exerciseId)
    }

}