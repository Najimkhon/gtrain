package com.hfad.gtrain.fragments.customExerciseFragment

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentCustomExerciseBinding
import com.hfad.gtrain.fragments.exerciseList.ExerciseListFragmentDirections
import com.hfad.gtrain.fragments.exerciseList.ReadyEcercisesFragment
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.ui.utils.SwipeHelper
import com.hfad.gtrain.viewmodels.MainViewmodel
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
        )
    }
    private val viewModel: MainViewmodel by activityViewModels()

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
        val customExercises = viewModel.getMuscleGroupWithCustomExercises(muscleGroup!!)
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
        //swipeToDelete(recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        swipeHelper(recyclerView, requireContext())
    }

    private fun swipeHelper(recyclerView: RecyclerView, context: Context){
        object : SwipeHelper(context, recyclerView, false) {
            override fun instantiateUnderlayButton(
                viewHolder: RecyclerView.ViewHolder?,
                underlayButtons: MutableList<UnderlayButton>?
            ) {

                underlayButtons?.add(UnderlayButton(
                    "Delete",
                    AppCompatResources.getDrawable(
                        context,
                        R.drawable.ic_delete
                    ),
                    Color.TRANSPARENT, Color.parseColor("#ffffff")
                ) { pos: Int ->
                    val itemToDelete = adapter.customExList[viewHolder!!.adapterPosition]
                    viewModel.deleteCustomExercise(itemToDelete)
                    adapter.notifyItemChanged(viewHolder.adapterPosition)
                    restoreDeletedData(viewHolder.itemView, itemToDelete, viewHolder.adapterPosition)
                    adapter.notifyItemChanged(pos)
                })

                underlayButtons?.add(UnderlayButton(
                    "Edit",
                    AppCompatResources.getDrawable(
                        context,
                        R.drawable.ic_edit
                    ),
                    Color.TRANSPARENT, Color.parseColor("#ffffff")
                ) {
                    val action =
                        ExerciseListFragmentDirections.actionExerciseListFragmentToUpdateExerciseFragment(adapter.item!!)
                    findNavController().navigate(action)
                })
            }

        }
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