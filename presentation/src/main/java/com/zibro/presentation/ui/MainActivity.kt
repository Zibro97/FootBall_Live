package com.zibro.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.zibro.presentation.R
import com.zibro.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navController : NavController
    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        navController = (supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment).findNavController()
        initViews()
    }

    private fun initViews() = with(binding){
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.matches,R.id.news,R.id.leagues,R.id.favorites,R.id.menu))
        bottomNavigationView.setupWithNavController(navController)
        toolbar.setupWithNavController(navController,appBarConfiguration)
    }
}