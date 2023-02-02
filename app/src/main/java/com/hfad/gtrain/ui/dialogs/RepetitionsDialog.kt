package com.hfad.gtrain.ui.dialogs

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.hfad.gtrain.databinding.NumberPickerViewBinding
import com.hfad.gtrain.databinding.RepsInputDialogBinding

class RepetitionsDialog(private val listener: OnDialogClickListener) : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dialogBinding =
            RepsInputDialogBinding.inflate(layoutInflater, null, false)
        val layout = dialogBinding.container
        var input: String
        var inputSets = 1
        var inputReps = ""
        var repsList = arrayOf(String())
        val npSets = dialogBinding.npSets
        npSets.maxValue = 5
        npSets.minValue = 0

        dialog?.setCanceledOnTouchOutside(true)
        dialog?.setCancelable(true)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        npSets.setOnValueChangedListener { _, _, newVal ->
            inputSets = newVal
            val repsArray = Array(newVal) { "1" }
            layout.removeAllViews()
            for (i in 1..newVal) {
                val npViewBinding =
                    NumberPickerViewBinding.inflate(layoutInflater, null, false)
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
            dialog?.cancel()
        }

        dialogBinding.btnCancel.setOnClickListener {
            dialog?.cancel()
        }
        dialog?.show()

        return dialogBinding.root

    }

}