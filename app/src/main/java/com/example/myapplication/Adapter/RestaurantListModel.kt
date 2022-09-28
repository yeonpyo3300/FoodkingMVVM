package com.example.myapplication.Adapter

import android.util.Log

class RestaurantListModel(
    var restName: String? = null,
    var restAddress: String? = null,
    var restReviewRating: Int? = null,
    var restCategory: String? = null,
    val restImage: String? = null

    )
{
    companion object{
        const val TAG : String = "Test log"
    }

    init {
        Log.d(TAG,"RestaurantListModel - () called")
    }

}
