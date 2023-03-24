package com.hfad.gtrain.fragments.exerciseList

import android.view.View
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.hfad.gtrain.R
import com.hfad.gtrain.base.BaseFragment
import com.hfad.gtrain.databinding.FragmentExerciseListBinding
import com.hfad.gtrain.models.Exercise
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExerciseListFragment : BaseFragment<FragmentExerciseListBinding>
    (FragmentExerciseListBinding::inflate), ExsListLayout.OnItemClickListener {

    private val args by navArgs<ExerciseListFragmentArgs>()

    init {
        isCustomExerciseView = false
    }

    override fun setListeners() {
        binding.btnSwitchToCustom.setOnClickListener {
            isCustomExerciseView = true
            updateTabSelection()
        }
        binding.btnSwitchToExercises.setOnClickListener {
            isCustomExerciseView = false
            updateTabSelection()
        }
    }

    override fun prepareUI() {
        binding.vp.isUserInputEnabled = false
        binding.vp.adapter = ExerciseListVpAdapter(childFragmentManager, lifecycle, args.muscleGroup!!)
        binding.vp.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        updateTabSelection()
    }

    private fun updateTabSelection() {
        if (isCustomExerciseView) {
            setTabSelected(binding.btnSwitchToCustom)
            setTabDeselected(binding.btnSwitchToExercises)
            binding.vp.setCurrentItem(1, true)
        } else {
            setTabSelected(binding.btnSwitchToExercises)
            setTabDeselected(binding.btnSwitchToCustom)
            binding.vp.setCurrentItem(0, true)
        }
    }

    private fun setTabSelected(tab: View) {
        tab.setBackgroundResource(R.drawable.button_light_blue_bg)
    }

    private fun setTabDeselected(tab: View) {
        tab.setBackgroundResource(R.drawable.dark_oval_card_bg)
    }

    override fun onItemClicked(clickedItem: Exercise) {}

    companion object {

        var isCustomExerciseView = false
    }
}