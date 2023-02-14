package com.hfad.gtrain.fragments.exerciseList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentReadyEcercisesBinding
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator

@AndroidEntryPoint
class ReadyEcercisesFragment(val muscleGroup: String) : Fragment(),
    ExsListLayout.OnItemClickListener {

    // private val args by navArgs<ExerciseListFragmentArgs>()
    private var _binding: FragmentReadyEcercisesBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()
    private val adapter: ExsListAdapter by lazy { ExsListAdapter(requireContext(), this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReadyEcercisesBinding.inflate(inflater, container, false)

        initializeViewmodel()
        setupRecyclerView()

        return binding.root
    }

    private fun initializeViewmodel() {
        val exercises = viewModel.getMuscleGroupWithExercises(muscleGroup)
        exercises.observe(viewLifecycleOwner) {
            adapter.setData(it[0].exercises)
        }
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.rvExerciseList
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.itemAnimator = LandingAnimator().apply { addDuration = 300 }

    }

    override fun onItemClicked(clickedItem: Exercise) {
        val action =
            ExerciseListFragmentDirections.actionExerciseListFragmentToExerciseDetailFragment(clickedItem)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}