package com.hfad.gtrain.fragments.addExercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.hfad.gtrain.databinding.FragmentAddExerciseBinding
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.ui.dialogs.DialogManager
import com.hfad.gtrain.ui.dialogs.OnDialogClickListener
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddExerciseFragment : Fragment() {
    private var _binding: FragmentAddExerciseBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()
    private lateinit var dialogManager: DialogManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialogManager = DialogManager(childFragmentManager)
        _binding = FragmentAddExerciseBinding.inflate(inflater, container, false)

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

        viewModel.getAllmuscleGroup.observe(viewLifecycleOwner) {
            muscleGroupList = it
        }
        
        return binding.root
    }

    companion object {
        var muscleGroupList = listOf<MuscleGroup>()
    }


}