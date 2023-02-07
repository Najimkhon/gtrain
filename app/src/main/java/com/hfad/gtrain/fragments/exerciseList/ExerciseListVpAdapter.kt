package com.hfad.gtrain.fragments.exerciseList

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hfad.gtrain.fragments.customExerciseFragment.CustomExerciseFragment

class ExerciseListVpAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragmentList = arrayListOf<Fragment>()
    private var muscleGroup = ""

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                ReadyEcercisesFragment(muscleGroup)
            }
            1->{
                CustomExerciseFragment(muscleGroup)
            }else->{
                ReadyEcercisesFragment(muscleGroup)
            }
        }
    }

    fun addFragment(fragment: Fragment){
        fragmentList.add(fragment)
    }

    fun setMuscleGroup(currentMuscle: String){
        muscleGroup = currentMuscle
    }
}