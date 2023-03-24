package com.hfad.gtrain.fragments.exerciseDetail

import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hfad.gtrain.databinding.FragmentVideoPlayerBinding
import com.hfad.gtrain.viewmodels.MainViewModel
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener


class VideoPlayerFragment : Fragment() {
    private val args by navArgs<VideoPlayerFragmentArgs>()
    private var _binding: FragmentVideoPlayerBinding? = null
    private val binding get() = _binding!!
    private lateinit var bottomNav: BottomNavigationView
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoPlayerBinding.inflate(inflater, container, false)

        bindViews()
        setupYouTubePlayer()
        fullScreenHandler()

        return binding.root
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation === Configuration.ORIENTATION_LANDSCAPE) {
            viewModel.isLandscape.value = true
            binding.youtubePlayer.enterFullScreen()
            hideStatusBar()
            viewModel.isLandscape.observe(viewLifecycleOwner) {
                println(it)
            }


        } else if (newConfig.orientation === Configuration.ORIENTATION_PORTRAIT) {
            viewModel.isLandscape.value = false
            binding.youtubePlayer.exitFullScreen()
            showStatusBar()
            viewModel.isLandscape.observe(viewLifecycleOwner) {
                println(it)
            }
        }
    }

    private fun fullScreenHandler() {
        bottomNav = requireActivity().findViewById(com.hfad.gtrain.R.id.bottomNavigationView)
        viewModel.isLandscape.observe(viewLifecycleOwner) {
            if (it) {
                binding.tvTitle.visibility = View.GONE
                binding.tvDescription.visibility = View.GONE
                bottomNav.visibility = View.GONE
                println(it)
            } else {
                binding.tvTitle.visibility = View.VISIBLE
                binding.tvDescription.visibility = View.VISIBLE
                bottomNav.visibility = View.VISIBLE
                println(it)
            }
        }
    }

    private fun setupYouTubePlayer() {
        binding.youtubePlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                super.onReady(youTubePlayer)
                youTubePlayer.loadVideo(args.currentExercise.videoUrl, 1F)
            }
        })
    }

    private fun bindViews() {
        binding.tvTitle.text = args.currentExercise.name
        binding.tvDescription.text = args.currentExercise.description

    }

    private fun hideStatusBar() {
        val window: Window = requireActivity().window
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).apply {
            // Hide the status bar
            hide(WindowInsetsCompat.Type.statusBars())
            // Allow showing the status bar with swiping from top to bottom
            systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }

    private fun showStatusBar() {
        val window: Window = requireActivity().window
        WindowCompat.setDecorFitsSystemWindows(window, true)
        WindowInsetsControllerCompat(window, window.decorView).apply {
            // Hide the status bar
            show(WindowInsetsCompat.Type.statusBars())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.youtubePlayer.release()
        _binding = null

    }
}