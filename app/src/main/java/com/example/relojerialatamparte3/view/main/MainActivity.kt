package com.example.relojerialatamparte3.view.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.relojerialatamparte3.R
import com.example.relojerialatamparte3.databinding.MainActivityBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setSupportActionBar(binding.toolbar)
        setContentView(binding.root)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_Fragment) as NavHostFragment
        navController=navHostFragment.navController
        setupActionBarWithNavController(navController)
        setupDestinationChangedListener()
    }
    private fun setupDestinationChangedListener() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.lobbyFragment -> {
                    supportActionBar?.title = "Relojeria Latam"
                    supportActionBar?.setDisplayHomeAsUpEnabled(false)
                    supportActionBar?.setDisplayShowHomeEnabled(false)
                }
                R.id.otherFragment -> {
                    supportActionBar?.title = "Cicero Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.secondFragment -> {
                    supportActionBar?.title = "Li Europan Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.thirdFragment -> {
                    supportActionBar?.title = "Kafka Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.forthFragment -> {
                    supportActionBar?.title = "Love Craft Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.fifthFragment -> {
                    supportActionBar?.title = "The Ancient Marine"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.sixthFragment -> {
                    supportActionBar?.title = "Leather Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.seventhFragment -> {
                    supportActionBar?.title = "A Tiempo Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.eighthFragment -> {
                    supportActionBar?.title = "Black Klee"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.ninethFragment -> {
                    supportActionBar?.title = "Watcher Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                R.id.tenthFragment -> {
                    supportActionBar?.title = "Jauggernaut Store"
                    supportActionBar?.setDisplayHomeAsUpEnabled(true)
                    supportActionBar?.setDisplayShowHomeEnabled(true)
                }
                else -> {
                    supportActionBar?.setDisplayHomeAsUpEnabled(false)
                    supportActionBar?.setDisplayShowHomeEnabled(false)
                }
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(this, "Settings ...", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        super.onPrepareOptionsMenu(menu)
        val logoutItem = menu?.findItem(R.id.action_logout)
        return super.onPrepareOptionsMenu(menu)
    }
}

