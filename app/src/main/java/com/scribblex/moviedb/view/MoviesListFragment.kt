package com.scribblex.moviedb.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.scribblex.moviedb.R
import com.scribblex.moviedb.databinding.FragmentMoviesListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoviesListFragment : Fragment() {

    private lateinit var binding: FragmentMoviesListBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoviesListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initButton()
        navController = Navigation.findNavController(view)
    }

    private fun initButton() {
        binding.button.text = "Click Here"
        binding.button.setOnClickListener {
            navController.navigate(R.id.movieList_to_movieDetailScreen)
        }
    }
}