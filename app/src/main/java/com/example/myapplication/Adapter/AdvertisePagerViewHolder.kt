package com.example.myapplication.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.advertise_pager_recycler.view.*

class AdvertisePagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val itemImage = itemView.home_top_advertise

    fun bindView(advertisePagerModel: AdvertisePagerModel) {
        itemImage.setImageResource(advertisePagerModel.imageSRC)
    }
}