package com.example.myapplication.Adapter

import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import kotlinx.android.synthetic.main.menu_recycler.view.*

class FoodListViewHolder(private val context: Context, itemView : View) : RecyclerView.ViewHolder(itemView) {

    val TAG : String = "Test Log"

    private val menuName = itemView.menu_name
    private val menuPrice = itemView.menu_price
    private val checkBox = itemView.checkbox_menu
    private val foodImage = itemView.menu_image


    init {
        Log.d(TAG, "view holder init")
    }

    fun bindView (foodModel: FoodModel) {
        Log.d(TAG, "bind view with model")

        menuName.text = foodModel.foodName
        menuPrice.text = "${foodModel.foodPrice} $"
        checkBox.isChecked = foodModel.completed

        Glide
            .with(context)
            .load(foodModel.foodImage)
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            .into(foodImage)
    }


}