package com.example.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.R

import com.example.newsapp.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
   lateinit var binding:ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Fragment is not the view, its a container that's why we can't use id of host fragment using binding variable
        val newsNavHostFragmentId = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)

        binding.bottomNavigationView.setupWithNavController(newsNavHostFragmentId!!.findNavController())
    }
}