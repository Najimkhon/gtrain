package com.hfad.gtrain.fragments.muscleGroupList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.hfad.gtrain.data.DummyData
import com.hfad.gtrain.databinding.FragmentMuscleGroupListBinding
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MuscleGroupListFragment : Fragment() {
    private var _binding: FragmentMuscleGroupListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMuscleGroupListBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.tvWelcomeMessage.text = viewModel.testString
        binding.tvCategoryName.setOnClickListener {
            val exercises = viewModel.getMuscleGroupWithExercises("Chest")
            exercises.observe(viewLifecycleOwner) {
                if (it.isNotEmpty()) {
                    binding.tvCategoryName.text = it[0].exercises[0].name
                }
            }
            val records = viewModel.getExerciseWithRecords(0)
            records.observe(viewLifecycleOwner) {
                if (it.isNotEmpty()) {
                    binding.tvDescription.text = it[0].records[0].exerciseId.toString()
                }
            }
        }

        binding.tvWelcomeMessage.setOnClickListener {
            println("hop: Button is pressed")
            viewModel.getAllmuscleGroup.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.muscleGroups.forEach { muscleGroup ->
                        viewModel.insertMuscleGroup(muscleGroup)

                        println("hop: MuscleGroup is added")
                    }
                }
            }
            viewModel.getAllExercise.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.exercises.forEach { exercise ->
                        viewModel.insertExercise(exercise)
                        println("hop: Exercise is added")
                    }
                }
            }

            viewModel.getAllRecord.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.records.forEach { record ->
                        viewModel.insertRecord(record)
                        println("hop: Record is added")
                    }
                }
            }

        }

        return view

    }


}