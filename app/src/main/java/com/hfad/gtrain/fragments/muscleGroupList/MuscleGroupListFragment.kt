package com.hfad.gtrain.fragments.muscleGroupList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.gtrain.data.DummyData
import com.hfad.gtrain.databinding.FragmentMuscleGroupListBinding
import com.hfad.gtrain.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator

@AndroidEntryPoint
class MuscleGroupListFragment : Fragment(), MuscleGroupItemLayout.OnItemClickListener {
    private var _binding: FragmentMuscleGroupListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewmodel by viewModels()
    private val adapter: MuscleGroupAdapter by lazy {MuscleGroupAdapter(requireContext(), this)}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMuscleGroupListBinding.inflate(inflater, container, false)
        val view = binding.root
        
        binding.tvWelcomeMessage.setOnClickListener {
            println("hop: Button is pressed")
            viewModel.getAllmuscleGroup.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.muscleGroups.forEach { muscleGroup ->
                        viewModel.insertMuscleGroup(muscleGroup)

                        println("hop: MuscleGroup is added")
                    }
                }
            }
            viewModel.getAllExercise.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.exercises.forEach { exercise ->
                        viewModel.insertExercise(exercise)
                        println("hop: Exercise is added")
                    }
                }
            }

            viewModel.getAllRecord.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    DummyData.records.forEach { record ->
                        viewModel.insertRecord(record)
                        println("hop: Record is added")
                    }
                }
            }

        }
        viewModel.getAllmuscleGroup.observe(viewLifecycleOwner){
            adapter.setData(it)
        }

        setupRecyclerView()

        return view

    }

    private fun setupRecyclerView(){
        val recyclerView = binding.rvMuscleGroupList
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.itemAnimator = LandingAnimator().apply { addDuration = 300 }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}