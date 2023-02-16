package com.hfad.gtrain.viewmodels


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.relations.ExerciseWithRecords
import com.hfad.gtrain.models.relations.MuscleGroupWithCustomExercises
import com.hfad.gtrain.models.relations.MuscleGroupWithExercises
import com.hfad.gtrain.repositories.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewmodel @Inject constructor(
    val roomRepository: RoomRepository
):ViewModel() {
    init {
        println("VM is created")
    }
    var isLandscape: MutableLiveData<Boolean> = MutableLiveData(false)
    var muscleGroup = ""
    val getAllmuscleGroup: LiveData<List<MuscleGroup>> = roomRepository.getAllmuscleGroup
    val getAllExercise: LiveData<List<Exercise>> = roomRepository.getAllExercise
    val getAllRecord: LiveData<List<Record>> = roomRepository.getAllRecord

    fun insertMuscleGroup(muscleGroup: MuscleGroup) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insertMuscleGroup(muscleGroup)
        }
    }
    fun insertExercise(exercise: Exercise) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insertExercise(exercise)
        }
    }
    fun insertCustomExercise(customEx: CustomExercise) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insertCustomExercise(customEx)
        }
    }
    fun insertRecord(record: Record){
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insertRecord(record)
        }
    }

    fun getMuscleGroupWithCustomExercises(muscleGroupTitle: String): LiveData<List<MuscleGroupWithCustomExercises>> {
        return roomRepository.getMuscleGroupWithCustomExercises(muscleGroupTitle)
    }

    fun getMuscleGroupWithExercises(muscleGroupTitle: String): LiveData<List<MuscleGroupWithExercises>> {
        return roomRepository.getMuscleGroupWithExercises(muscleGroupTitle)
    }

    fun getExerciseWithRecords(exerciseId: Int):LiveData<List<ExerciseWithRecords>> {
        return roomRepository.getExerciseWithRecords(exerciseId)
    }

    fun deleteCustomExercise(customEx: CustomExercise){
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.deleteCustomExercise(customEx)
        }
    }

    fun updateCustomExercise(customEx: CustomExercise){
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.updateCustomExercise(customEx)
        }
    }
}