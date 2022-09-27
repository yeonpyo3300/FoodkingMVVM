package com.example.myapplication.Adapter

import android.content.Context
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import kotlinx.android.synthetic.main.menu_recycler.view.*

class FoodListViewHolder(
    private val context: Context,
    foodRecyclerViewInterface: FoodRecyclerViewInterface,
    itemView: View
) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {

    val TAG : String = "Test log"

    private val menuName = itemView.menu_name
    private val menuPrice = itemView.menu_price
    private val checkBox = itemView.checkbox_menu
    private val foodImage = itemView.menu_image

    private var foodRecyclerViewInterface: FoodRecyclerViewInterface? = null

    init {
        Log.d(TAG,"FoodListViewHolder - () called")
        this.foodRecyclerViewInterface = foodRecyclerViewInterface
        itemView.setOnClickListener(this)
    }

    fun bindView(foodModel: FoodModel) {
        Log.d(TAG,"FoodListViewHolder - bindView() called")

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

    override fun onClick(view: View?) {
        this.foodRecyclerViewInterface?.onItemClicked(adapterPosition)
    }


}