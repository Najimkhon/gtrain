package com.hfad.gtrain.fragments.exerciseList

import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.hfad.gtrain.R
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.databinding.FragmentExerciseListBinding
import com.hfad.gtrain.models.Exercise
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExerciseListFragment : BaseFragment<FragmentExerciseListBinding>
    (FragmentExerciseListBinding::inflate), ExsListLayout.OnItemClickListener {

    private val args by navArgs<ExerciseListFragmentArgs>()


    override fun prepareUI() {
        binding.vp.isUserInputEnabled = false
        binding.vp.adapter =
            ExerciseListVpAdapter(childFragmentManager, lifecycle, args.muscleGroup!!)
        binding.vp.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tabLayout, binding.vp) { tab, index ->
            tab.text = when (index) {
                0 -> {
                    getString(R.string.exercise_tab_label)
                }
                1 -> {
                    getString(R.string.custom_tab_label)
                }
                else -> {
                    getString(R.string.exercise_tab_label)
                }
            }
        }.attach()
    }

    override fun onItemClicked(clickedItem: Exercise) {}

}