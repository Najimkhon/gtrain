package com.hfad.gtrain.viewmodels


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.repositories.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewmodel @Inject constructor(
    val roomRepository: RoomRepository
):ViewModel() {
    val testString = "Dagger works!"
    val getAllData: LiveData<List<MuscleGroup>> = roomRepository.getAllData
    fun insertMuscleGroup(muscleGroup: MuscleGroup) {
        viewModelScope.launch(Dispatchers.IO) {
            roomRepository.insertMuscleGroup(muscleGroup)
        }
    }
}