package com.hfad.gtrain.fragments.exerciseDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.hfad.gtrain.databinding.FragmentExerciseDetailBinding
import com.hfad.gtrain.fragments.exerciseDetail.adapters.VpImagesAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ExerciseDetailFragment : Fragment() {
    private val args by navArgs<ExerciseDetailFragmentArgs>()
    private var _binding: FragmentExerciseDetailBinding? = null
    private val binding get() = _binding!!
    private val adapter: VpImagesAdapter by lazy { VpImagesAdapter(requireContext()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExerciseDetailBinding.inflate(inflater, container, false)

        setupViewPager()
        setListeners()
        bindViews()

        return binding.root
    }


    private fun setListeners() {
        binding.btnPlay.setOnClickListener {
            val action =
                ExerciseDetailFragmentDirections.actionExerciseDetailFragmentToVideoPlayerFragment(args.currentExercise)
            findNavController().navigate(action)
        }
    }

    private fun bindViews() {
        binding.tvDescription.text = args.currentExercise.description
    }

    private fun setupViewPager() {
        val viewPager = binding.vpImages
        viewPager.adapter = adapter
        adapter.setData(args.currentExercise.image)
    }
}