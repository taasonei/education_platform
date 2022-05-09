package com.github.taasonei.educationplatform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.github.taasonei.educationplatform.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val toolBarConfiguration = AppBarConfiguration(navController.graph)

        binding.bottomNav.setupWithNavController(navController)
        binding.toolbar.setupWithNavController(navController, toolBarConfiguration)

        navController.addOnDestinationChangedListener{ _, _, arguments ->
            binding.toolbar.isVisible = arguments?.getBoolean("showToolbar", false) == true
        }
    }

}