package com.hfad.gtrain.fragments.categoryList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.NavHostFragment
import com.hfad.gtrain.R
import com.hfad.gtrain.data.DummyData
import com.hfad.gtrain.databinding.FragmentCategoryListBinding
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.log

@AndroidEntryPoint
class CategoryListFragment : Fragment() {
    private var _binding: FragmentCategoryListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryListBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.tvWelcomeMessage.text = viewModel.testString
        val exercises = viewModel.getMuscleGroupWithExercises("Chest")
        exercises.observe(viewLifecycleOwner){
            binding.tvCategoryName.text = it[0].exercises[0].name
        }


        binding.tvWelcomeMessage.setOnClickListener {
            println("hop: Button is pressed")
            viewModel.getAllData.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.muscleGroups.forEach { muscleGroup ->
                        insertMuscleGroup(muscleGroup)

                        println("hop: MuscleGroups are added")
                    }
                }
            }
            viewModel.getAllExercise.observe(viewLifecycleOwner){
                if (it.isEmpty()){
                    DummyData.exercises.forEach { exercise ->
                        viewModel.insertExercise(exercise)
                        println("hop: Exercises are added")
                    }
                }
            }


        }



        return view

    }

    private fun insertMuscleGroup(muscleGroup: MuscleGroup) {
        viewModel.insertMuscleGroup(muscleGroup)
    }

}