package com.hfad.gtrain.repositories

import androidx.lifecycle.LiveData
import com.hfad.gtrain.data.ExerciseDao
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.relations.ExerciseWithRecords
import com.hfad.gtrain.models.relations.MuscleGroupWithExercises
import javax.inject.Inject

class RoomRepository @Inject constructor(
   val exerciseDao: ExerciseDao
) {
    val testString = "Dagger works!"
    val getAllData: LiveData<List<MuscleGroup>> = exerciseDao.getAllData()
    suspend fun insertMuscleGroup(muscleGroup: MuscleGroup){
        exerciseDao.insertMuscleGroup(muscleGroup)
    }
    suspend fun insertExercise(exercise: Exercise){
        exerciseDao.insertExercise(exercise)
    }
    suspend fun insertRecord(record: Record){
        exerciseDao.insertRecord(record)
    }
    fun getMuscleGroupWithExercises(id: Int):LiveData<List<MuscleGroupWithExercises>>{
        return exerciseDao.getMuscleGroupWithExercises(id)
    }
    fun getExerciseWithRecords(exerciseId: Int):LiveData<List<ExerciseWithRecords>> {
        return exerciseDao.getExerciseWithRecords(exerciseId)
    }


}