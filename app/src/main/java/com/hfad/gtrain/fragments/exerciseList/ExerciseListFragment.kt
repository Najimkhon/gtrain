package com.hfad.gtrain.fragments.exerciseList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentExerciseListBinding
import com.hfad.gtrain.fragments.customExerciseFragment.CustomExerciseFragment
import com.hfad.gtrain.models.Exercise
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExerciseListFragment : Fragment(), ExsListLayout.OnItemClickListener {

    private val args by navArgs<ExerciseListFragmentArgs>()
    private var _binding: FragmentExerciseListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExerciseListBinding.inflate(inflater, container, false)

        setListeners()
        pageTurner()
        setupViewPager()

        return binding.root

    }

    private fun setupViewPager(){
        val vp = binding.vp
        val vpAdapter = ExerciseListVpAdapter(childFragmentManager, lifecycle)
        vpAdapter.addFragment(ReadyEcercisesFragment(args.muscleGroup!!))
        vpAdapter.addFragment(CustomExerciseFragment(args.muscleGroup!!))
        vpAdapter.setMuscleGroup(args.muscleGroup!!)
        vp.isUserInputEnabled = false
        vp.adapter = vpAdapter
        vp.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    private fun pageTurner(){
        if (isCustomExerciseView){
            binding.btnSwitchToExercises.setBackgroundDrawable(resources.getDrawable(R.drawable.dark_oval_card_bg))
            binding.btnSwitchToCustom.setBackgroundDrawable(resources.getDrawable(R.drawable.button_light_blue_bg))
            binding.vp.setCurrentItem(1, true)

        }else{
            binding.btnSwitchToExercises.setBackgroundDrawable(resources.getDrawable(R.drawable.button_light_blue_bg))
            binding.btnSwitchToCustom.setBackgroundDrawable(resources.getDrawable(R.drawable.dark_oval_card_bg))
            binding.vp.setCurrentItem(0, true)
        }
    }

    private fun setListeners(){
        binding.btnSwitchToCustom.setOnClickListener{
            isCustomExerciseView = true
            pageTurner()
        }
        binding.btnSwitchToExercises.setOnClickListener{
            isCustomExerciseView =false
            pageTurner()
        }
    }

    override fun onItemClicked(clickedItem: Exercise) {

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object{
        var isCustomExerciseView = false
    }
}