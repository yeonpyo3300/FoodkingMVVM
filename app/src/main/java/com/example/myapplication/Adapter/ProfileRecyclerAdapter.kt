package com.example.myapplication.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Payment
import com.example.myapplication.R


class ProfileRecyclerAdapter : RecyclerView.Adapter<ProfileViewHolder>()

{
    private var paymentList = ArrayList<Payment>()

//    fun removeTask(position: Int) {
//        paymentList.removeAt(position)
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val from = LayoutInflater.from(parent.context)
        return ProfileViewHolder(
            from.inflate(R.layout.payment_recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bindView(paymentList[position])
    }

    override fun getItemCount(): Int {
        return paymentList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(paymentMethod:ArrayList<Payment>) {
        this.paymentList = paymentMethod
        notifyDataSetChanged()
    }

}