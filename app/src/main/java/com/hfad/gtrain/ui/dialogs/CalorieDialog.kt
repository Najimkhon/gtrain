package com.hfad.gtrain.ui.dialogs

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.hfad.gtrain.databinding.CalorieInputDialogBinding

class CalorieDialog(private val listener: OnDialogClickListener) : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dialogBinding =
            CalorieInputDialogBinding.inflate(layoutInflater, null, false)
        val npCalories = dialogBinding.npCalories
        npCalories.maxValue = 200
        npCalories.minValue = 1

        dialog?.setCanceledOnTouchOutside(true)
        dialog?.setCancelable(true)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogBinding.btnSave.setOnClickListener {
            listener.onSaveClicked(npCalories.value.toString())
            dialog?.cancel()
        }
        dialogBinding.btnCancel.setOnClickListener {
            dialog?.cancel()
        }
        dialog?.show()

        return dialogBinding.root

    }
}