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
    val exerciseDao: ExerciseDao
) {
    val getAllmuscleGroup: LiveData<List<MuscleGroup>> = exerciseDao.getAllMuscleGroup()
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

    fun getMuscleGroupWithExercises(muscleGroup: String): LiveData<List<MuscleGroupWithExercises>> {
        return exerciseDao.getMuscleGroupWithExercises(muscleGroup)
    }

    fun getMuscleGroupWithCustomExercises(muscleGroup: String): LiveData<List<MuscleGroupWithCustomExercises>> {
        return exerciseDao.getMuscleGroupWithCustomExercises(muscleGroup)
    }

    fun getExerciseWithRecords(exerciseId: Int): LiveData<List<ExerciseWithRecords>> {
        return exerciseDao.getExerciseWithRecords(exerciseId)
    }

    suspend fun deleteCustomExercise(customEx: CustomExercise) {
        exerciseDao.deleteCustomExercise(customEx)
    }

    suspend fun updateCustomExercise(customEx: CustomExercise) {
        exerciseDao.updateCustomExercise(customEx)
    }

    suspend fun updateRecord(record: Record) {
        exerciseDao.updateRecord(record)
    }

    suspend fun isRecordExist(date: Long, exerciseId: Int): Boolean {
        return exerciseDao.isRecordExist(date, exerciseId)
    }

    fun getAllRecordsByDate(date: Long):LiveData<List<Record>>{
        return exerciseDao.getAllRecordsByDate(date)
    }
    fun getRecordListByDay(date: Long):LiveData<List<Record>>{
        return exerciseDao.getRecordListByDay(date)
    }

    suspend fun getRecordByDate(date: Long, exerciseId: Int): Record{
        return exerciseDao.getRecordByDate(date, exerciseId)
    }

}