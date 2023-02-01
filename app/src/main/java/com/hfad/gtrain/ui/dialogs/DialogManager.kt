package com.hfad.gtrain.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.hfad.gtrain.databinding.FieldInputDialogBinding
import com.hfad.gtrain.databinding.TextInputDialogBinding


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
            dialogBinding.btnCancel.setOnClickListener{
                dialog.cancel()
            }
            dialog.show()
        }

        fun showExerciseDescriptionDialog(context: Context, listener: OnDialogClickListener){
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
            dialogBinding.btnCancel.setOnClickListener{
                dialog.cancel()
            }
            dialog.show()
        }


    }
}


interface OnDialogClickListener {
    fun onSaveClicked(input: String)
}
