package com.hfad.gtrain.fragments.graphFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.hfad.gtrain.databinding.FragmentGraphBinding
import com.hfad.gtrain.viewmodels.MainViewmodel


class GraphFragment : Fragment() {
    private val args by navArgs<GraphFragmentArgs>()
    private var _binding: FragmentGraphBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGraphBinding.inflate(inflater, container, false)
        viewModel.getExerciseWithRecords(args.exerciseId).observe(viewLifecycleOwner){
            binding.toolbar.tvTitle.text = it[0].exercise.name
        }




        return binding.root
    }
}