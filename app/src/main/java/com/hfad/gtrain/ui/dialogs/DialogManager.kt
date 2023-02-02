package com.hfad.gtrain.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.hfad.gtrain.databinding.*
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

        fun showRepetitionsDialog(context: Context, listener: OnDialogClickListener) {
            val dialogBinding =
                RepsInputDialogBinding.inflate(LayoutInflater.from(context), null, false)
            val layout = dialogBinding.container
            var input: String
            var inputSets = 1
            var inputReps = ""
            var repsList = arrayOf(String())


            val npSets = dialogBinding.npSets
            npSets.maxValue = 5
            npSets.minValue = 0


            val dialog = Dialog(context)
            dialog.setContentView(dialogBinding.root)
            dialog.setCanceledOnTouchOutside(true)
            dialog.setCancelable(true)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            npSets.setOnValueChangedListener { _, _, newVal ->
                inputSets = newVal
                val repsArray = Array(newVal) { "1" }
                layout.removeAllViews()
                for (i in 1..newVal) {
                    val npViewBinding =
                        NumberPickerViewBinding.inflate(LayoutInflater.from(context), null, false)
                    val npReps = npViewBinding.npRep
                    layout.addView(npViewBinding.root)
                    npReps.maxValue = 99
                    npReps.minValue = 1
                    npReps.id = i
                    npReps.setOnValueChangedListener { _, _, newVal ->
                        repsArray[npReps.id - 1] = newVal.toString()
                        repsList = repsArray
                    }
                }
            }

            dialogBinding.btnSave.setOnClickListener {
                repsList.forEachIndexed { _, value ->
                    if (value.isEmpty()) {
                        inputReps = "0"
                    } else {
                        inputReps += "$value/"
                    }
                }
                input = "Sets: $inputSets Reps: $inputReps"
                listener.onSaveClicked(input)
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
