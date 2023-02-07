package com.hfad.gtrain.fragments.addExercise

import android.app.Activity.RESULT_OK
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.hfad.gtrain.databinding.FragmentAddExerciseBinding
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.ui.dialogs.DialogManager
import com.hfad.gtrain.ui.dialogs.OnDialogClickListener
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException

@AndroidEntryPoint
class AddExerciseFragment : Fragment() {
    private var _binding: FragmentAddExerciseBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()
    private lateinit var dialogManager: DialogManager
    private var imageUri: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialogManager = DialogManager(childFragmentManager)
        _binding = FragmentAddExerciseBinding.inflate(inflater, container, false)

        setListeners()

        viewModel.getAllmuscleGroup.observe(viewLifecycleOwner) {
            muscleGroupList = it
        }

        return binding.root
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

        binding.categoryBlock.setOnClickListener {
            dialogManager.showMuscleGroupDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvMuscleGroup.text = input
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

        binding.caloriesBlock.setOnClickListener {
            dialogManager.showCalorieDialog(object : OnDialogClickListener {
                override fun onSaveClicked(input: String) {
                    binding.tvCalories.text = input
                }
            })
        }

        binding.btnSave.setOnClickListener {
            val exName = binding.tvExerciseName.text.toString()
            val muscleGroup = binding.tvMuscleGroup.text.toString()

            if (exName.isNotEmpty() && muscleGroup.isNotEmpty()) {
                val description = binding.tvDescription.text.toString()
                val newExercise = CustomExercise(
                    0,
                    exName,
                    null,
                    "",
                    description,
                    0,
                    muscleGroup,
                    0,
                    arrayListOf()
                )

                var setsInt = 0
                var repsList = arrayListOf<Int>()
                if (binding.tvRepetition.text.isNotEmpty()) {
                    setsInt = getSets()
                    repsList = getReps()
                }

                newExercise.sets = setsInt
                newExercise.reps = repsList
                newExercise.reps.forEachIndexed { index, i ->
                    println("$index of $i")
                }
                val image = imageUri
                newExercise.image = image

                val calories = binding.tvCalories.text
                if (calories.isNotEmpty()) {
                    newExercise.calories = calories.toString().toInt()
                }
                addCustomExercise(newExercise)

            } else {
                Toast.makeText(requireContext(), "Muscle Category", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun getReps(): ArrayList<Int> {
        val repsList = arrayListOf<Int>()
        val repetitionsInput = binding.tvRepetition.text
        val repetitionsArray = repetitionsInput.toString().split(" ").toTypedArray()[3]
        val stringReps = repetitionsArray.split("/").toTypedArray()
        val repsInt = Array(stringReps.size) { 0 }
        stringReps.forEachIndexed { index, rep ->
            repsInt[index] = rep.toInt()
            repsList.add(rep.toInt())
        }
        return repsList
    }

    private fun getSets(): Int {
        val sets = binding.tvRepetition.text.toString()[6]
        return sets.digitToInt()
    }

    private fun launchGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    private fun saveBitmapToInternalStorage(filename: String, bmp: Bitmap): Boolean {
        return try {
            requireActivity().openFileOutput(filename, Context.MODE_PRIVATE).use { stream ->
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

    private fun addCustomExercise(customEx: CustomExercise) {
        viewModel.insertCustomExercise(customEx)
        findNavController().popBackStack()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_PICK_CODE && resultCode == RESULT_OK) {
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
        var muscleGroupList = listOf<MuscleGroup>()
    }


}