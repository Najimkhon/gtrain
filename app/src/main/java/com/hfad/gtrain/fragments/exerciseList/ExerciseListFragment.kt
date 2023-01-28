package com.hfad.gtrain.fragments.exerciseList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentExerciseListBinding
import com.hfad.gtrain.databinding.FragmentMuscleGroupListBinding
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator

@AndroidEntryPoint
class ExerciseListFragment : Fragment(), ExsListLayout.OnItemClickListener {

    private var _binding: FragmentExerciseListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()
    private val adapter: ExsListAdapter by lazy { ExsListAdapter(requireContext(), this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExerciseListBinding.inflate(inflater, container, false)
        viewModel.getAllExercise.observe(viewLifecycleOwner){
            adapter.setData(it)
        }

        binding.btnSwitchToCustom.setOnClickListener{
            binding.btnSwitchToExercises.setBackgroundDrawable(resources.getDrawable(R.drawable.dark_oval_card_bg))
            binding.btnSwitchToCustom.setBackgroundDrawable(resources.getDrawable(R.drawable.button_light_blue_bg))
        }
        binding.btnSwitchToExercises.setOnClickListener{
            binding.btnSwitchToExercises.setBackgroundDrawable(resources.getDrawable(R.drawable.button_light_blue_bg))
            binding.btnSwitchToCustom.setBackgroundDrawable(resources.getDrawable(R.drawable.dark_oval_card_bg))
        }

        setupRecyclerView()
        return binding.root

    }

    private fun setupRecyclerView() {
        val recyclerView = binding.rvExerciseList
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.itemAnimator = LandingAnimator().apply { addDuration = 300 }
    }

    override fun onItemClicked(clickedItem: Exercise) {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}