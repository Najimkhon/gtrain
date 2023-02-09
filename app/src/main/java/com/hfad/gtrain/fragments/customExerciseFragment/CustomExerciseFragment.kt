package com.hfad.gtrain.fragments.customExerciseFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentCustomExerciseBinding
import com.hfad.gtrain.fragments.exerciseList.ExerciseListFragmentDirections
import com.hfad.gtrain.fragments.muscleGroupList.MuscleGroupListFragmentDirections
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.ui.utils.SwipeToDelete
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CustomExerciseFragment(val muscleGroup: String) : Fragment(),
    CustomExListLayout.OnItemClickListener {

    private var _binding: FragmentCustomExerciseBinding? = null
    private val binding get() = _binding!!
    private val adapter: CustomExerciseAdapter by lazy {
        CustomExerciseAdapter(
            requireContext(),
            this
        )
    }
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
        customExercises.observe(viewLifecycleOwner) {
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
        swipeToDelete(recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun swipeToDelete(recyclerView: RecyclerView) {
        val swipeToDeleteCallback = object : SwipeToDelete() {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val itemToDelete = adapter.customExList[viewHolder.adapterPosition]
                viewModel.deleteCustomExercise(itemToDelete)
                adapter.notifyItemChanged(viewHolder.adapterPosition)
                restoreDeletedData(viewHolder.itemView, itemToDelete, viewHolder.adapterPosition)
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}