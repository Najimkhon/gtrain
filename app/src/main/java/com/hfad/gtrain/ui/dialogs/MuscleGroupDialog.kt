package com.hfad.gtrain.ui.dialogs

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.hfad.gtrain.databinding.MuscleGroupInputDialogBinding
import com.hfad.gtrain.fragments.addExercise.AddExerciseFragment

class MuscleGroupDialog(private val listener: OnDialogClickListener) : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dialogBinding =
            MuscleGroupInputDialogBinding.inflate(layoutInflater, null, false)
        val muscleGroupList = AddExerciseFragment.muscleGroupList
        val categoryNames = Array(muscleGroupList.size) { "" }

        muscleGroupList.forEachIndexed { index, mg ->
            categoryNames[index] = mg.title
        }

        val npMuscleGroup = dialogBinding.npMuscleGroup
        npMuscleGroup.maxValue = muscleGroupList.size - 1
        npMuscleGroup.minValue = 0
        npMuscleGroup.displayedValues = categoryNames

        dialog?.setCanceledOnTouchOutside(true)
        dialog?.setCancelable(true)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogBinding.btnSave.setOnClickListener {
            val muscleGroupInput = categoryNames[dialogBinding.npMuscleGroup.value]
            listener.onSaveClicked(muscleGroupInput)
            dialog?.cancel()
        }
        dialogBinding.btnCancel.setOnClickListener {
            dialog?.cancel()
        }
        dialog?.show()

        return dialogBinding.root

    }
}