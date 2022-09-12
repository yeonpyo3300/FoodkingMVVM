package com.example.myapplication

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_home_avtivity.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Test on Create")
        onLoginButtonClicked()
    }

    fun onLoginButtonClicked(){
        val intent = Intent(this, HomeAvtivity::class.java)
        btn_onboarding_login.setOnClickListener {
            startActivity(intent)
        }
    }


}