package com.hfad.gtrain.fragments.categoryList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.hfad.gtrain.R
import com.hfad.gtrain.databinding.FragmentCategoryListBinding
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryListFragment : Fragment() {
    private var _binding: FragmentCategoryListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryListBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.tvWelcomeMessage.text = viewModel.testString

        return view

    }

}