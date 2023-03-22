package com.hfad.gtrain.fragments.customExerciseFragment

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import com.hfad.gtrain.databinding.CustomExerciseItemLayoutBinding
import com.hfad.gtrain.models.CustomExercise
import github.com.st235.lib_swipetoactionlayout.SwipeAction
import github.com.st235.lib_swipetoactionlayout.SwipeMenuListener
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CustomExListLayout(
    context: Context,
    private val listener: OnItemClickListener,
    private val onActionClicked: OnActionClicked
) :
    RelativeLayout(context), SwipeMenuListener {

    private val binding =
        CustomExerciseItemLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var currentExercise: CustomExercise
    private val swipeActionLayout = binding.swipeToActionLayout
    private var position = 0


    fun fillContent(currentExercise: CustomExercise, position: Int) {
        swipeActionLayout.menuListener = this
        this.currentExercise = currentExercise
        this.position = position
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

    override fun onActionClicked(view: View, action: SwipeAction) {
        onActionClicked(currentExercise, action, position)
        swipeActionLayout.close()
    }

    override fun onClosed(view: View) {
    }

    override fun onFullyOpened(view: View, quickAction: SwipeAction) {
    }

    override fun onOpened(view: View) {
    }

    interface OnItemClickListener {
        fun onItemClicked(clickedItem: CustomExercise)
    }
}