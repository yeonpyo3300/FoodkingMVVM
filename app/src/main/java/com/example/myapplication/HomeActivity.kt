package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.Fragment.HomeFragment
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_home_avtivity.*

class HomeActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment

    val TAG: String = "Test log"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_avtivity)

        //Set default fragment - Home fragment
        homeFragment = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.fragments_nav, homeFragment).commit()

        //Item selected
        nav_bottom_home.setOnItemSelectedListener(onBottomNavItemSelectedListener)
        Log.d(TAG, "HomeActivity - onCreate() called")

    }

    private val onBottomNavItemSelectedListener = NavigationBarView.OnItemSelectedListener {
        when (it.itemId) {
            R.id.home_nav -> {
                Log.d(TAG, "HomeActivity - () called")
                homeFragment = HomeFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_nav, homeFragment)
                    .commit()
            }
        }
        true
    }
}