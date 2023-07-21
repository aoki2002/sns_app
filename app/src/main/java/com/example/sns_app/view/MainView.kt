package com.example.sns_app.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.sns_app.R
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.lifecycle.Observer
import com.example.sns_app.databinding.FragmentSigninBinding
import com.example.sns_app.viewmodel.MainViewModel
import com.example.sns_app.viewmodel.SignInViewModel
import com.example.sns_app.viewmodel.UserViewModel

class MainView: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.nav_bar_host) as NavHostFragment

        val navController = navHostFragment.navController

        val bottomNavigationView: BottomNavigationView = view.findViewById(R.id.bottom_navigation)

        bottomNavigationView.setupWithNavController(navController)

        return view
    }
}