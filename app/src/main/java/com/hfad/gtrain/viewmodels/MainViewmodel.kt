package com.hfad.gtrain.viewmodels


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hfad.gtrain.models.*
import com.hfad.gtrain.models.Set
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
) : ViewModel() {
    init {
        println("VM is created")
    }

    var isLandscape: MutableLiveData<Boolean> = MutableLiveData(false)
    var muscleGroup = ""
    val getAllmuscleGroup: LiveData<List<MuscleGroup>> = roomRepository.getAllmuscleGroup
    val getAllExercise: LiveData<List<Exercise>> = roomRepository.getAllExercise
    val getLogDays: LiveData<List<Long>> = roomRepository.getLogDays

    private val _recordListByDay = MutableLiveData<List<Record>>()
    val recordListByDay: LiveData<List<Record>> = _recordListByDay

    private val _muscleGroupWithExercises = MutableLiveData<List<MuscleGroupWithExercises>>()
    val muscleGroupWithExercises = _muscleGroupWithExercises

    private val _muscleGroupWithCustomExercises = MutableLiveData<List<MuscleGroupWithCustomExercises>>()
    val muscleGroupWithCustomExercises = _muscleGroupWithCustomExercises

    private val _exerciseWithRecords = MutableLiveData<List<ExerciseWithRecords>>()
    val exerciseWithRecords = _exerciseWithRecords

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

    fun insertRecord(record: Record) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insertRecord(record)
        }
    }

    fun getMuscleGroupWithCustomExercises(muscleGroupTitle: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val muscleGroupList = roomRepository.getMuscleGroupWithCustomExercises(muscleGroupTitle)
            _muscleGroupWithCustomExercises.postValue(muscleGroupList)
        }
    }

    fun getMuscleGroupWithExercises(muscleGroupTitle: String){
        viewModelScope.launch(Dispatchers.IO) {
            val muscleGroupList = roomRepository.getMuscleGroupWithExercises(muscleGroupTitle)
            _muscleGroupWithExercises.postValue(muscleGroupList)
        }
    }

    fun getExerciseWithRecords(exerciseId: Int){
        viewModelScope.launch(Dispatchers.IO) {
            val exercises = roomRepository.getExerciseWithRecords(exerciseId)
            _exerciseWithRecords.postValue(exercises)
        }
    }

    fun deleteCustomExercise(customEx: CustomExercise) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.deleteCustomExercise(customEx)
        }
    }

    fun deleteRecord(record: Record) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.deleteRecord(record)
        }
    }

    fun updateCustomExercise(customEx: CustomExercise) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.updateCustomExercise(customEx)
        }
    }

    fun updateRecord(record: Record) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.updateRecord(record)
        }
    }

    fun getRecordListByDay(date: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val recordList = roomRepository.getRecordListByDay(date)
            _recordListByDay.postValue(recordList)
        }
    }

    suspend fun getRecordByDate(date: Long, exerciseId: Int): Record {
        return roomRepository.getRecordByDate(date, exerciseId)
    }

    fun addRecord(date: Long, exerciseId: Int, set: Set) {
        viewModelScope.launch {
            val existingRecord = getRecordByDate(date, exerciseId)
            if (existingRecord != null) {
                existingRecord.set.add(set)
                updateRecord(existingRecord)
            } else {
                val newRecord = Record(0, date, exerciseId, mutableListOf(set))
                insertRecord(newRecord)
            }
        }
    }
}
