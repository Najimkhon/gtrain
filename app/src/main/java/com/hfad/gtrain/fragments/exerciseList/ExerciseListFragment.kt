package com.hfad.gtrain.fragments.exerciseList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentExerciseListBinding
import com.hfad.gtrain.fragments.customExerciseFragment.CustomExerciseFragment
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator

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
        setupViewPager()

        return binding.root

    }

    private fun setupViewPager(){
        val vp = binding.vp
        val vpAdapter = ExerciseListVpAdapter(parentFragmentManager, lifecycle)
        vpAdapter.addFragment(ReadyEcercisesFragment(args.muscleGroup!!))
        vpAdapter.addFragment(CustomExerciseFragment())
        vpAdapter.setMuscleGroup(args.muscleGroup!!)
        vp.adapter = vpAdapter
        vp.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    private fun setListeners(){
        binding.btnSwitchToCustom.setOnClickListener{
            binding.btnSwitchToExercises.setBackgroundDrawable(resources.getDrawable(R.drawable.dark_oval_card_bg))
            binding.btnSwitchToCustom.setBackgroundDrawable(resources.getDrawable(R.drawable.button_light_blue_bg))
            binding.vp.setCurrentItem(1, true)
        }
        binding.btnSwitchToExercises.setOnClickListener{
            binding.btnSwitchToExercises.setBackgroundDrawable(resources.getDrawable(R.drawable.button_light_blue_bg))
            binding.btnSwitchToCustom.setBackgroundDrawable(resources.getDrawable(R.drawable.dark_oval_card_bg))
            binding.vp.setCurrentItem(0, true)
        }
    }

    override fun onItemClicked(clickedItem: Exercise) {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}