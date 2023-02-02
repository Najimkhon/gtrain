package com.hfad.gtrain.ui.dialogs

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.hfad.gtrain.databinding.TextInputDialogBinding

class ExerciseNameDialog(private val listener: OnDialogClickListener):DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dialogBinding =
            TextInputDialogBinding.inflate(layoutInflater, null, false)
        dialog?.setCanceledOnTouchOutside(true)
        dialog?.setCancelable(true)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogBinding.btnSave.setOnClickListener {
            listener.onSaveClicked(dialogBinding.etInput.text.toString())
            dialog?.cancel()
        }
        dialogBinding.btnCancel.setOnClickListener {
            dialog?.cancel()
        }

        return dialogBinding.root

    }
}