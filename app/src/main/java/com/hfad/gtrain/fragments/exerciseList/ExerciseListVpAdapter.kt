package com.hfad.gtrain.fragments.exerciseList

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hfad.gtrain.fragments.customExerciseFragment.CustomExerciseFragment


class ExerciseListVpAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val muscleGroup: String
) : FragmentStateAdapter(fragmentManager, lifecycle) {


    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ReadyEcercisesFragment.newInstance(muscleGroup)
            }
            1 -> {
                CustomExerciseFragment.newInstance(muscleGroup)
            }
            else -> {
                ReadyEcercisesFragment.newInstance(muscleGroup)
            }
        }
    }

}