package com.hfad.gtrain.fragments.muscleGroupList

import android.view.View
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.data.DummyData
import com.hfad.gtrain.databinding.FragmentMuscleGroupListBinding
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator

@AndroidEntryPoint
class MuscleGroupListFragment : BaseFragment<FragmentMuscleGroupListBinding>(
    FragmentMuscleGroupListBinding::inflate
), MuscleGroupItemLayout.OnItemClickListener {

    private val viewModel: MainViewModel by activityViewModels()

    private val adapter: MuscleGroupAdapter by lazy { MuscleGroupAdapter(requireContext(), this) }

    override fun setListeners() {
        binding.scrollView.setOnScrollChangeListener(
            NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, _ ->
                if (scrollY > 0) {
                    binding.toolbarDivider.visibility = View.VISIBLE
                } else {
                    binding.toolbarDivider.visibility = View.GONE
                }
            })
    }

    override fun prepareUI() {
        binding.toolbar.tvTitle.text = "Muscle Groups"

        binding.rvMuscleGroupList.adapter = adapter
        binding.rvMuscleGroupList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvMuscleGroupList.itemAnimator = LandingAnimator().apply { addDuration = 300 }
    }

    override fun setObservers() {
        viewModel.getAllMuscleGroup.observe(viewLifecycleOwner) {
            if (it.isEmpty()) {
                DummyData.muscleGroups.forEach { muscleGroup ->
                    viewModel.insertMuscleGroup(muscleGroup)
                    println("hop: MuscleGroup is added")
                }
            } else {
                adapter.setData(it)
            }
        }
        viewModel.getAllExercise.observe(viewLifecycleOwner) {
            if (it.isEmpty()) {
                DummyData.exercises.forEach { exercise ->
                    viewModel.insertExercise(exercise)
                    println("hop: Exercise is added")
                }
            }
        }
    }

    override fun onItemClicked(clickedItem: MuscleGroup) {
        val action =
            MuscleGroupListFragmentDirections.actionMuscleGroupListFragmentToExerciseListFragment(
                clickedItem.title
            )
        findNavController().navigate(action)
    }
}