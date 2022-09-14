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
    val TAG : String = "test"
    init {
        Log.d(TAG, "RestModel is created")
    }

}
