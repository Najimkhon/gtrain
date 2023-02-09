package com.hfad.gtrain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.hfad.gtrain.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
        val files = filesDir.listFiles()

//        navController
//            .addOnDestinationChangedListener{_, destination, _->
//                when(destination.id){
//                    R.id.exerciseDetailFragment -> binding.bottomNavigationView.visibility = View.GONE
//                    else-> binding.bottomNavigationView.visibility = View.VISIBLE
//                }
//            }


    }
}