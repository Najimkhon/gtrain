package com.hfad.gtrain.fragments.customExerciseFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentCustomExerciseBinding
import com.hfad.gtrain.databinding.FragmentExerciseListBinding
import com.hfad.gtrain.ui.dialogs.TextInputDialog


class CustomExerciseFragment : Fragment() {

    private var _binding: FragmentCustomExerciseBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCustomExerciseBinding.inflate(inflater, container, false)
        
        binding.btnEdit.setOnClickListener{
            val dialog = object: TextInputDialog(requireContext()){

            }
            dialog.show()
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}