package com.hfad.gtrain.fragments.customExerciseFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentCustomExerciseBinding
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CustomExerciseFragment(val muscleGroup:String) : Fragment(), CustomExListLayout.OnItemClickListener {

    private var _binding: FragmentCustomExerciseBinding? = null
    private val binding get() = _binding!!
    private val adapter: CustomExerciseAdapter by lazy { CustomExerciseAdapter(requireContext(), this) }
    private val viewModel: MainViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCustomExerciseBinding.inflate(inflater, container, false)

        binding.btnEdit.setOnClickListener {

        }
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_exerciseListFragment_to_addExerciseFragment)
        }
        val customExercises = viewModel.getMuscleGroupWithCustomExercises(muscleGroup)
        customExercises.observe(viewLifecycleOwner){
            adapter.setData(it[0].customExercises)
            println("Test" + it.size)
        }
        setupRecyclerView()
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.rvCustom
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onItemClicked(clickedItem: CustomExercise) {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}