package com.hfad.gtrain.fragments.exerciseDetail

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.hfad.gtrain.databinding.FragmentVideoPlayerBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback


class VideoPlayerFragment : Fragment() {
    private val args by navArgs<VideoPlayerFragmentArgs>()
    private var _binding: FragmentVideoPlayerBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoPlayerBinding.inflate(inflater, container, false)
        bindViews()

        lifecycle.addObserver(binding.youtubePlayer)
        binding.youtubePlayer.getYouTubePlayerWhenReady(object : YouTubePlayerCallback {
            override fun onYouTubePlayer(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(args.currentExercise.videoUrl, 1F)
            }
        })



        return binding.root
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            binding.youtubePlayer.enterFullScreen()
            println("landscape")
        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            binding.youtubePlayer.exitFullScreen()
            println("portrait")
        }
    }

    private fun bindViews() {
        binding.tvTitle.text = args.currentExercise.name
        binding.tvDescription.text = args.currentExercise.description

    }
}