package com.hfad.gtrain.fragments.exerciseList

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hfad.gtrain.fragments.customExerciseFragment.CustomExerciseFragment

class ExerciseListVpAdapter(
    fragmentManager: FragmentManager, lifecycle: Lifecycle, private val muscleGroup: String
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    enum class FragmentType {
        READY, CUSTOM
    }

    override fun getItemCount() = TAB_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (FragmentType.values()[position]) {
            FragmentType.READY -> ReadyExercisesFragment.newInstance(muscleGroup)
            FragmentType.CUSTOM -> CustomExerciseFragment.newInstance(muscleGroup)
        }
    }

    companion object {
        const val TAB_COUNT = 2
    }

}