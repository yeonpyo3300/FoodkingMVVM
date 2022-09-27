package com.example.myapplication.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class RestaurantListAdapter : RecyclerView.Adapter<RestaurantListViewHolder>() {

    val TAG : String = "Test log"

    private var restaurantList = ArrayList<RestaurantListModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantListViewHolder {
        val from = LayoutInflater.from(parent.context)
        return RestaurantListViewHolder(parent.context,from.inflate(R.layout.restaurant_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: RestaurantListViewHolder, position: Int) {
        holder.bindView(restaurantList[position])
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    fun createList (restaurantList : ArrayList<RestaurantListModel> ) {
        this.restaurantList = restaurantList
        Log.d(TAG,"RestaurantListAdapter - createList() called")
    }
}