package com.hfad.gtrain.fragments.customExerciseFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hfad.gtrain.R

import com.hfad.gtrain.databinding.FragmentCustomExerciseBinding


class CustomExerciseFragment : Fragment() {

    private var _binding: FragmentCustomExerciseBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCustomExerciseBinding.inflate(inflater, container, false)
        
        binding.btnEdit.setOnClickListener{

        }
        binding.btnAdd.setOnClickListener{
            findNavController().navigate(R.id.action_exerciseListFragment_to_addExerciseFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}