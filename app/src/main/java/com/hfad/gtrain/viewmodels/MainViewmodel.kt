package com.hfad.gtrain.viewmodels


import androidx.lifecycle.ViewModel
import com.hfad.gtrain.repositories.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewmodel @Inject constructor(
    val mainRepository: RoomRepository
):ViewModel() {
    val testString = "Dagger works!"
}