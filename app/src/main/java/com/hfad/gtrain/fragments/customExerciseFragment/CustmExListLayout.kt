package com.hfad.gtrain.fragments.customExerciseFragment

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.hfad.gtrain.databinding.CustomExerciseItemLayoutBinding
import com.hfad.gtrain.models.CustomExercise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CustomExListLayout(context: Context, private val listener: OnItemClickListener) :
    RelativeLayout(context) {

    private val binding =
        CustomExerciseItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)


    fun fillContent(currentExercise: CustomExercise) {
        binding.tvExTitle.text = currentExercise.name
        binding.tvCalorie.text = currentExercise.calories.toString()

        CoroutineScope(Dispatchers.IO).launch {
            val photos = loadPhotos(currentExercise.image, context)
            if (photos.isNotEmpty()) {
                withContext(Dispatchers.Main) {
                    binding.ivImage.setImageBitmap(photos[0])
                }
            }
        }
        binding.cvExercise.setOnClickListener {
            listener.onItemClicked(currentExercise)
        }

    }

    private suspend fun loadPhotos(imageName: String, context: Context): List<Bitmap> {
        return withContext(Dispatchers.IO) {
            val files = context.filesDir.listFiles()
            files.filter { it.canRead() && it.isFile && it.name.contentEquals(imageName) }.map {
                val bytes = it.readBytes()
                BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(clickedItem: CustomExercise)
    }

}