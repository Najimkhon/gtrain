package com.hfad.gtrain.fragments.customExerciseFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentCustomExerciseBinding
import com.hfad.gtrain.fragments.exerciseList.ExerciseListFragmentDirections
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

private const val MUSCLE_GROUP = ""

@AndroidEntryPoint
class CustomExerciseFragment : Fragment(),
    CustomExListLayout.OnItemClickListener {

    private var _binding: FragmentCustomExerciseBinding? = null
    private val binding get() = _binding!!
    private val adapter: CustomExerciseAdapter by lazy {
        CustomExerciseAdapter(
            requireContext(),
            this
        ) { currentExercise, action, position ->
            when (action.actionId) {
                R.id.edit -> {
                    val action =
                        ExerciseListFragmentDirections.actionExerciseListFragmentToUpdateExerciseFragment(
                            currentExercise
                        )
                    findNavController().navigate(action)
                }
                R.id.delete -> {
                    deleteExercise(currentExercise, position)
                }
            }
        }
    }
    private val viewModel: MainViewModel by activityViewModels()

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
        _binding = FragmentCustomExerciseBinding.inflate(inflater, container, false)

        binding.btnEdit.setOnClickListener {

        }
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_exerciseListFragment_to_addExerciseFragment)
        }
        viewModel.getMuscleGroupWithCustomExercises(muscleGroup!!)
        viewModel.muscleGroupWithCustomExercises.observe(viewLifecycleOwner) {
            adapter.setData(it[0].customExercises)
        }
        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.rvCustom
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)

    }

    private fun deleteExercise(customExercise: CustomExercise, position: Int) {
        viewModel.deleteCustomExercise(customExercise)
        adapter.notifyItemChanged(position)
        restoreDeletedData(binding.root, customExercise, position)
        adapter.notifyItemChanged(position)
    }

    private fun restoreDeletedData(view: View, deletedItem: CustomExercise, position: Int) {
        val snackbar = Snackbar.make(
            view,
            "Deleted '${deletedItem.name}'",
            Snackbar.LENGTH_LONG
        )
        snackbar.setAction("Undo") {
            viewModel.insertCustomExercise(deletedItem)
            adapter.notifyItemChanged(position)
        }
        snackbar.show()
    }

    override fun onItemClicked(clickedItem: CustomExercise) {
        val action =
            ExerciseListFragmentDirections.actionExerciseListFragmentToUpdateExerciseFragment(
                clickedItem
            )
        findNavController().navigate(action)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            CustomExerciseFragment().apply {
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