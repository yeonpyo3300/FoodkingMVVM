package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class AdvertisePagerRecyclerAdapter(private var pageList: ArrayList<AdvertisePagerModel>) :
    RecyclerView.Adapter<AdvertisePagerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdvertisePagerViewHolder {
        val from = LayoutInflater.from(parent.context)
       return AdvertisePagerViewHolder(
        from.inflate(R.layout.advertise_pager_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: AdvertisePagerViewHolder, position: Int) {
        holder.bindView(pageList[position])
    }

    override fun getItemCount(): Int {
       return pageList.size
    }


}