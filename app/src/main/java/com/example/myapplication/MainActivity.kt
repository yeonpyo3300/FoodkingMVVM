package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG : String = "Test log"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"MainActivity - onCreate() called")

        onLoginButtonClicked()
    }

    fun onLoginButtonClicked(){
        val intent = Intent(this, HomeActivity::class.java)
        btn_onboarding_login.setOnClickListener {
            startActivity(intent)
        }
    }


}