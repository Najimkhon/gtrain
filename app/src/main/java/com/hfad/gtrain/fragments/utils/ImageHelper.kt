package com.hfad.gtrain.fragments.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class ImageHelper @Inject constructor(private val context: Context) {

    suspend fun loadPhotos(imageName: String, context: Context): List<Bitmap> {
        return withContext(Dispatchers.IO) {
            val files = context.filesDir.listFiles()
            files.filter { it.canRead() && it.isFile && it.name.contentEquals(imageName) }.map {
                val bytes = it.readBytes()
                BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            }
        }
    }

    fun saveBitmapToInternalStorage(filename: String, bmp: Bitmap): Boolean {
        return try {
            context.openFileOutput(filename, Context.MODE_PRIVATE).use { stream ->
                if (!bmp.compress(Bitmap.CompressFormat.JPEG, 95, stream)) {
                    throw IOException("Couldn't save bitmap.")
                }
            }
            true
        } catch (e: IOException) {
            e.printStackTrace()
            false
        }
    }

    fun decodeSampledBitmapFromStream(
        inputStream: InputStream, reqWidth: Int, reqHeight: Int
    ): Bitmap? {
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true

        // Read the input stream into a byte array
        val byteArrayOutputStream = ByteArrayOutputStream()
        inputStream.copyTo(byteArrayOutputStream)
        val bytes = byteArrayOutputStream.toByteArray()

        BitmapFactory.decodeByteArray(bytes, 0, bytes.size, options)

        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight)

        options.inJustDecodeBounds = false
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size, options)
    }

    private fun calculateInSampleSize(
        options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int
    ): Int {
        val height = options.outHeight
        val width = options.outWidth
        var inSampleSize = 1

        if (height > reqHeight || width > reqWidth) {
            val halfHeight = height / 2
            val halfWidth = width / 2

            while ((halfHeight / inSampleSize) >= reqHeight && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2
            }
        }
        return inSampleSize
    }

    fun generateFileName(): String {
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        return "image_$timestamp.jpg"
    }

}