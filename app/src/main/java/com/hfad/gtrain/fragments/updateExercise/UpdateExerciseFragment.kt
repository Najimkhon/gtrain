package com.hfad.gtrain.fragments.updateExercise

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.hfad.gtrain.databinding.FragmentUpdateExerciseBinding
import com.hfad.gtrain.fragments.exerciseList.ExerciseListFragment
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.ui.dialogs.DialogManager
import com.hfad.gtrain.ui.dialogs.OnDialogClickListener
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException
import javax.inject.Inject


@AndroidEntryPoint
class UpdateExerciseFragment : Fragment() {

    private val args by navArgs<UpdateExerciseFragmentArgs>()
    private var _binding: FragmentUpdateExerciseBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()
    private var imageUri: Uri? = null
    private var imageName: String = ""

    @Inject
    lateinit var dialogManager: DialogManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUpdateExerciseBinding.inflate(inflater, container, false)
        setListeners()
        bindViews()

        return binding.root
    }

    private fun bindViews() {
        lifecycleScope.launch {
            val photos = loadPhotos(args.currentExercise.image, requireContext())
            if (photos.isNotEmpty()) {
                binding.ivAddImage.setImageBitmap(photos[0])
            }
        }
        binding.tvExerciseName.text = args.currentExercise.name
        binding.tvDescription.text = args.currentExercise.description
        binding.tvRepetition.text =
            makeRepetitionsString(args.currentExercise.sets, args.currentExercise.reps)
        binding.tvMuscleGroup.text = args.currentExercise.muscleGroup
        binding.tvCalories.text = args.currentExercise.calories.toString()
    }

    private fun setListeners() {
        binding.ivAddImage.setOnClickListener {
            launchGallery()
        }

        binding.exerciseBlock.setOnClickListener {
            dialogManager.showExerciseNameDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvExerciseName.text = input
                }
            })
        }

        binding.descritionBlock.setOnClickListener {
            dialogManager.showExerciseDescriptionDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvDescription.text = input
                }
            })
        }

        binding.repsBlock.setOnClickListener {
            dialogManager.showRepetitionsDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvRepetition.text = input
                }
            })
        }

        binding.categoryBlock.setOnClickListener {
            dialogManager.showMuscleGroupDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvMuscleGroup.text = input
                }
            })
        }

        binding.caloriesBlock.setOnClickListener {
            dialogManager.showCalorieDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvCalories.text = input
                }
            })
        }

        binding.btnSave.setOnClickListener {
            updateExercise()
        }
        binding.btnCancel.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun makeRepetitionsString(sets: Int, reps: List<Int>): String {
        var repetitions = "Sets: $sets Reps: "
        reps.forEach {
            repetitions += "$it/"
        }
        return repetitions.dropLast(1)
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

    private fun updateExercise() {
        val exName = binding.tvExerciseName.text.toString()
        val muscleGroup = binding.tvMuscleGroup.text.toString()
        val description = binding.tvDescription.text.toString()
        val repetitionsInput = binding.tvRepetition.text.toString()
        val calories = binding.tvCalories.text.toString()

        if (exName.isNotEmpty() && muscleGroup.isNotEmpty() && description.isNotEmpty() && repetitionsInput.isNotEmpty() && calories.isNotEmpty()) {
            val setsInt = getSets(repetitionsInput)
            val repsList = getReps(repetitionsInput)
            val newExercise = CustomExercise(
                args.currentExercise.id,
                exName,
                imageName,
                "",
                description,
                calories.toInt(),
                muscleGroup,
                setsInt,
                repsList
            )
            viewModel.updateCustomExercise(newExercise)
            findNavController().popBackStack()
            ExerciseListFragment.isCustomExerciseView = true
        } else {
            Toast.makeText(requireContext(), "Please, fill all the fields!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun getReps(repetitionsInput: String): ArrayList<Int> {
        val repsList = arrayListOf<Int>()
        val repetitionsArray = repetitionsInput.split(" ").toTypedArray()[3]
        val stringReps = repetitionsArray.split("/").toTypedArray()
        val repsInt = Array(stringReps.size) { 0 }
        stringReps.forEachIndexed { index, rep ->
            repsInt[index] = rep.toInt()
            repsList.add(rep.toInt())
        }
        return repsList
    }

    private fun getSets(sets: String): Int {
        return sets[6].digitToInt()
    }

    private fun saveBitmapToInternalStorage(filename: String, bmp: Bitmap): Boolean {
        return try {
            requireActivity().openFileOutput(filename, Context.MODE_PRIVATE).use { stream ->
                if (!bmp.compress(Bitmap.CompressFormat.JPEG, 95, stream)) {
                    throw IOException("Couldn't save bitmap.")
                }
                imageName = filename
            }
            true
        } catch (e: IOException) {
            e.printStackTrace()
            false
        }
    }

    private fun launchGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_PICK_CODE && resultCode == Activity.RESULT_OK) {
            imageUri = data?.data!!
            val bitmap: Bitmap = MediaStore.Images.Media.getBitmap(
                requireContext().contentResolver, Uri.parse(
                    imageUri.toString()
                )
            )
            imageUri!!.lastPathSegment?.let { saveBitmapToInternalStorage(it, bitmap) }
            binding.ivAddImage.setImageURI(imageUri)
        }
    }

    companion object {
        private const val IMAGE_PICK_CODE = 999
    }

}