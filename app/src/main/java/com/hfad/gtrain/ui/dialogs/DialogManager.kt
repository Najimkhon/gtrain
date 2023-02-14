package com.hfad.gtrain.ui.dialogs

import androidx.fragment.app.FragmentManager
import javax.inject.Inject


class DialogManager @Inject constructor(private val fragmentManager: FragmentManager) {

    fun showExerciseNameDialog(listener: OnDialogClickListener) {
        val dialog = ExerciseNameDialog(listener)
        dialog.show(fragmentManager, "ExerciseNameDialog")
    }

    fun showExerciseDescriptionDialog(listener: OnDialogClickListener) {
        val dialog = ExerciseDescriptionDialog(listener)
        dialog.show(fragmentManager, "ExerciseDescriptionDialog")
    }

    fun showMuscleGroupDialog(listener: OnDialogClickListener) {
        val dialog = MuscleGroupDialog(listener)
        dialog.show(fragmentManager, "MuscleGroupDialog")
    }

    fun showRepetitionsDialog(listener: OnDialogClickListener) {
        val dialog = RepetitionsDialog(listener)
        dialog.show(fragmentManager, "MuscleGroupDialog")
    }

    fun showCalorieDialog(listener: OnDialogClickListener){
        val dialog = CalorieDialog(listener)
        dialog.show(fragmentManager, "CalorieDialog")
    }
}


interface OnDialogClickListener {
    fun onSaveClicked(input: String)
}
