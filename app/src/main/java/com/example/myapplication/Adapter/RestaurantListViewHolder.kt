package com.example.myapplication.Adapter

import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import kotlinx.android.synthetic.main.restaurant_recycler.view.*

class RestaurantListViewHolder(private val context: Context, itemView : View) : RecyclerView.ViewHolder(itemView) {

    val TAG : String = "Test Log"

    private val restName = itemView.restaurant_list_name
    private val restCategory = itemView.restaurant_list_category
    private val restAddress = itemView.restaurant_list_address
    private val restReviewRating = itemView.restaurant_list_review_rating
    private val restImage = itemView.restaurant_list_image

    init {
        Log.d(TAG, "Restaurant view holder init")
    }

    fun bindView(restaurantListModel: RestaurantListModel) {
        restName.text = restaurantListModel.restName
        restCategory.text = restaurantListModel.restCategory
        restAddress.text = restaurantListModel.restAddress
        restReviewRating.text = "Rate : ${restaurantListModel.restReviewRating.toString()}"

        Log.d(TAG, "Bind view with Restaurant view model")

        Glide
            .with(context)
            .load(restaurantListModel.restImage)
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            .into(restImage)


    }




}