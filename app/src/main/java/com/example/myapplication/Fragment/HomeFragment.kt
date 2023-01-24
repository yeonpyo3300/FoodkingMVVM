package com.example.myapplication.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.Adapter.AdvertisePagerModel
import com.example.myapplication.Adapter.AdvertisePagerRecyclerAdapter
import com.example.myapplication.UI.FoodMenuActivity
import com.example.myapplication.R
import com.example.myapplication.UI.RestarauntListActivity
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_restaurant.*


class HomeFragment : Fragment() {

    private var advertiseList = ArrayList<AdvertisePagerModel>()
    private lateinit var advertisePagerRecyclerAdapter: AdvertisePagerRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        restaurantClicked()
        restaurantViewMoreClicked()
        initializeAdView()

        //Test Admob advertisement at the bottom
//        MobileAds.initialize(this) {
//
//            val adRequest = AdRequest.Builder().build()
//            Admob_banner.loadAd(adRequest)
//        }

    }


    companion object {
        const val TAG: String = "Test log"

        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    private fun restaurantClicked() {
        val intent = Intent(requireActivity(), FoodMenuActivity::class.java)
        image_restaurant.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun restaurantViewMoreClicked() {
        val intent = Intent(requireActivity(), RestarauntListActivity::class.java)
        home_view_more_restaurant.setOnClickListener {
            startActivity(intent)
        }
    }

    private fun initializeAdView() {
        advertiseList.add(AdvertisePagerModel(R.drawable.home_advertise))
        advertiseList.add(AdvertisePagerModel(R.drawable.promotion2))
        advertiseList.add(AdvertisePagerModel(R.drawable.promotion3))

        advertisePagerRecyclerAdapter = AdvertisePagerRecyclerAdapter(advertiseList)
        advertise_view_pager.apply {
            adapter = advertisePagerRecyclerAdapter
            spring_dots_indicator.attachTo(this)
        }
    }



}