package com.hfad.gtrain.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import com.hfad.gtrain.databinding.TextInputDialogBinding

abstract class TextInputDialog(context: Context):Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        val dialogBinding = TextInputDialogBinding.inflate(LayoutInflater.from(context), null, false)
        setContentView(dialogBinding.root)
        setCanceledOnTouchOutside(true)
        setCancelable(true)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

    }
}