package com.hfad.gtrain.fragments.updateExercise

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.databinding.FragmentUpdateExerciseBinding
import com.hfad.gtrain.fragments.utils.ImageHelper
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.ui.dialogs.DialogManager
import com.hfad.gtrain.ui.dialogs.OnDialogClickListener
import com.hfad.gtrain.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class UpdateExerciseFragment :
    BaseFragment<FragmentUpdateExerciseBinding>(FragmentUpdateExerciseBinding::inflate) {

    private val args by navArgs<UpdateExerciseFragmentArgs>()
    private val viewModel: MainViewModel by activityViewModels()
    private var imageUri: Uri? = null
    private var imageName: String = ""

    @Inject
    lateinit var imageHelper: ImageHelper

    @Inject
    lateinit var dialogManager: DialogManager

    override fun prepareUI() {
        binding.apply {
            lifecycleScope.launch {
                val photos = imageHelper.loadPhotos(args.currentExercise.image, requireContext())
                if (photos.isNotEmpty()) {
                    ivAddImage.setImageBitmap(photos[0])
                }
            }
            tvExerciseName.text = args.currentExercise.name
            tvDescription.text = args.currentExercise.description
            tvRepetition.text =
                makeRepetitionsString(args.currentExercise.sets, args.currentExercise.reps)
            tvMuscleGroup.text = args.currentExercise.muscleGroup
            tvCalories.text = args.currentExercise.calories.toString()
        }
    }

    override fun setListeners() {
        binding.apply {
            ivAddImage.setOnClickListener {
                launchGallery()
            }

            exerciseBlock.setOnClickListener {
                dialogManager.showExerciseNameDialog(object : OnDialogClickListener {
                    override fun onSaveClicked(input: String) {
                        binding.tvExerciseName.text = input
                    }
                })
            }

            descritionBlock.setOnClickListener {
                dialogManager.showExerciseDescriptionDialog(object : OnDialogClickListener {
                    override fun onSaveClicked(input: String) {
                        binding.tvDescription.text = input
                    }
                })
            }

            repsBlock.setOnClickListener {
                dialogManager.showRepetitionsDialog(object : OnDialogClickListener {
                    override fun onSaveClicked(input: String) {
                        binding.tvRepetition.text = input
                    }
                })
            }

            categoryBlock.setOnClickListener {
                dialogManager.showMuscleGroupDialog(object : OnDialogClickListener {
                    override fun onSaveClicked(input: String) {
                        binding.tvMuscleGroup.text = input
                    }
                })
            }

            caloriesBlock.setOnClickListener {
                dialogManager.showCalorieDialog(object : OnDialogClickListener {
                    override fun onSaveClicked(input: String) {
                        binding.tvCalories.text = input
                    }
                })
            }

            btnSave.setOnClickListener {
                updateExercise()
            }
            btnCancel.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }

    private fun makeRepetitionsString(sets: Int, reps: List<Int>): String {
        var repetitions = "Sets: $sets Reps: "
        reps.forEach {
            repetitions += "$it/"
        }
        return repetitions.dropLast(1)
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
            imageUri!!.lastPathSegment?.let {
                imageHelper.saveBitmapToInternalStorage(it, bitmap)
                imageName = it
            }
            binding.ivAddImage.setImageURI(imageUri)
        }
    }

    companion object {
        private const val IMAGE_PICK_CODE = 999
    }
}