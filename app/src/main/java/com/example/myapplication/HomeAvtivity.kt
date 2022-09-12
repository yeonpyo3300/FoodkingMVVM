package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_home_avtivity.*
import kotlinx.android.synthetic.main.fragment_blank.*

class HomeAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_avtivity)

        //Admob advertisement at the bottom
        MobileAds.initialize(this) {

            val adRequest = AdRequest.Builder().build()
            Admob_banner.loadAd(adRequest)
        }

//        viewMoreClicked()
        restaurantClicked()
    }

//    fun viewMoreClicked() {
//        val intent = Intent(this, FoodMenuActivity::class.java)
//        home_view_more_restaurant.setOnClickListener {
//            startActivity(intent)
//        }
//    }

    private fun restaurantClicked() {
        val intent = Intent(this, FoodMenuActivity::class.java)
        image_restaurant.setOnClickListener {
            startActivity(intent)
        }
    }
}