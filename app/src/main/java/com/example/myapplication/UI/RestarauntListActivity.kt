package com.example.myapplication.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapter.RestaurantListAdapter
import com.example.myapplication.Adapter.RestaurantListModel
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_restaraunt_list.*

class RestarauntListActivity : AppCompatActivity() {

    companion object{
        const val TAG : String = "Test log"
    }

    var restaurantList = ArrayList<RestaurantListModel>()
    private lateinit var restAdapter: RestaurantListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaraunt_list)

        initializeView()
    }


    private fun initializeView() {
        for (i in 1..10) {
            val restModel = RestaurantListModel(
                restName = "Cake Station + $i",
                restAddress = "Aoba-ku, Kanagawa, Yokohama-city, Japan - ${(20..50).random()}",
                restCategory = "Cake, Fast food",
                restReviewRating = (1..5).random(),
                restImage = "https://www.nicepng.com/png/detail/106-1066495_chain-restaurant-operations-and-management-expert-witness-fast.png"
            )
            this.restaurantList.add(restModel)
        }

        restAdapter = RestaurantListAdapter()
        restAdapter.createList(restaurantList)

        restaurant_list_recycler.apply {
            layoutManager =
                LinearLayoutManager(this@RestarauntListActivity, LinearLayoutManager.VERTICAL, false)
            adapter = restAdapter
        }
    }

}