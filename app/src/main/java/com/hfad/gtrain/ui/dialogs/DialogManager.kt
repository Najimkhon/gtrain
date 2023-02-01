package com.hfad.gtrain.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.hfad.gtrain.databinding.FieldInputDialogBinding
import com.hfad.gtrain.databinding.MuscleGroupInputDialogBinding
import com.hfad.gtrain.databinding.TextInputDialogBinding
import com.hfad.gtrain.fragments.addExercise.AddExerciseFragment


class DialogManager {

    companion object {
        fun showExerciseNameDialog(context: Context, listener: OnDialogClickListener) {
            val dialog = Dialog(context)
            val dialogBinding =
                TextInputDialogBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setContentView(dialogBinding.root)
            dialog.setCanceledOnTouchOutside(true)
            dialog.setCancelable(true)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogBinding.btnSave.setOnClickListener {
                listener.onSaveClicked(dialogBinding.etInput.text.toString())
                dialog.cancel()
            }
            dialogBinding.btnCancel.setOnClickListener {
                dialog.cancel()
            }
            dialog.show()
        }

        fun showExerciseDescriptionDialog(context: Context, listener: OnDialogClickListener) {
            val dialog = Dialog(context)
            val dialogBinding =
                FieldInputDialogBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setContentView(dialogBinding.root)
            dialog.setCanceledOnTouchOutside(true)
            dialog.setCancelable(true)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogBinding.btnSave.setOnClickListener {
                listener.onSaveClicked(dialogBinding.etInput.text.toString())
                dialog.cancel()
            }
            dialogBinding.btnCancel.setOnClickListener {
                dialog.cancel()
            }
            dialog.show()
        }

        fun showMuscleGroupDialog(context: Context, listener: OnDialogClickListener) {
            val dialogBinding =
                MuscleGroupInputDialogBinding.inflate(LayoutInflater.from(context), null, false)
            val muscleGroupList = AddExerciseFragment.muscleGroupList
            val categoryNames = Array(muscleGroupList.size) { "" }

            muscleGroupList.forEachIndexed { index, mg ->
                categoryNames[index] = mg.title
            }

            val npMuscleGroup = dialogBinding.npMuscleGroup
            npMuscleGroup.maxValue = muscleGroupList.size - 1
            npMuscleGroup.minValue = 0
            npMuscleGroup.displayedValues = categoryNames

            val dialog = Dialog(context)
            dialog.setContentView(dialogBinding.root)
            dialog.setCanceledOnTouchOutside(true)
            dialog.setCancelable(true)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogBinding.btnSave.setOnClickListener {
                val muscleGroupInput = categoryNames[dialogBinding.npMuscleGroup.value]
                listener.onSaveClicked(muscleGroupInput)
                dialog.cancel()
            }
            dialogBinding.btnCancel.setOnClickListener {
                dialog.cancel()
            }
            dialog.show()

        }


    }
}


interface OnDialogClickListener {
    fun onSaveClicked(input: String)
}
