package com.hfad.gtrain.fragments.exerciseDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.hfad.gtrain.databinding.FragmentExerciseDetailBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.VpImagesAdapter
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ExerciseDetailFragment : Fragment() {
    private val args by navArgs<ExerciseDetailFragmentArgs>()
    private var _binding: FragmentExerciseDetailBinding? = null
    private val binding get() = _binding!!
    private val adapter: VpImagesAdapter by lazy { VpImagesAdapter(requireContext()) }
    private val viewModel: MainViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseDetailBinding.inflate(inflater, container, false)
        binding.tvDescription.text = args.currentExercise.description + args.currentExercise.description + args.currentExercise.description + args.currentExercise.description + args.currentExercise.description + args.currentExercise.description
        println(args.currentExercise.name)
        println(args.currentExercise.description)
        adapter.setData(args.currentExercise.image)
        setupViewPager()

        return binding.root
    }
    private fun setupViewPager(){
        val viewPager = binding.vpImages
        viewPager.adapter = adapter
    }
}