package com.hfad.gtrain.fragments.exerciseList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.databinding.FragmentReadyEcercisesBinding
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator

private const val MUSCLE_GROUP = ""


@AndroidEntryPoint
class ReadyEcercisesFragment : Fragment(),
    ExsListLayout.OnItemClickListener {


    private var _binding: FragmentReadyEcercisesBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()
    private val adapter: ExsListAdapter by lazy { ExsListAdapter(requireContext(), this) }

    private var muscleGroup: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            muscleGroup = it.getString(MUSCLE_GROUP)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReadyEcercisesBinding.inflate(inflater, container, false)

        initializeViewModel()
        setupRecyclerView()

        return binding.root
    }

    private fun initializeViewModel() {
        val exercises = viewModel.getMuscleGroupWithExercises(muscleGroup!!)
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

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            ReadyEcercisesFragment().apply {
                arguments = Bundle().apply {
                    putString(MUSCLE_GROUP, param1)
                }
            }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}