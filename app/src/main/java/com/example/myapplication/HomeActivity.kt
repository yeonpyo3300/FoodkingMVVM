package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.Fragment.CartFragment
import com.example.myapplication.Fragment.ChatFragment
import com.example.myapplication.Fragment.HomeFragment
import com.example.myapplication.Fragment.ProfileFragment
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_home_avtivity.*

class HomeActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment
    private lateinit var profileFragment: ProfileFragment
    private lateinit var cartFragment: CartFragment
    private lateinit var chatFragment: ChatFragment

    companion object{
        const val TAG : String = "Test log"
    }

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
                Log.d(TAG, "HomeNav - () called")
                homeFragment = HomeFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_nav, homeFragment)
                    .commit()
            }
            R.id.profile_nav -> {
                Log.d(TAG,"ProfileNav - () called")
                profileFragment = ProfileFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_nav, profileFragment)
                    .commit()
            }
            R.id.cart_nav -> {
                Log.d(TAG,"CartNav - () called")
                cartFragment = CartFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_nav, cartFragment)
                    .commit()
            }
            R.id.chat_nav -> {
                Log.d(TAG,"ChatNav - () called")
                chatFragment = ChatFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_nav, chatFragment)
                    .commit()
            }
        }
        true
    }
}