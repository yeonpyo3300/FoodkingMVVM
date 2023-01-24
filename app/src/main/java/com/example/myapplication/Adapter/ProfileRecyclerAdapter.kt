package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Payment
import com.example.myapplication.R


class ProfileRecyclerAdapter(private var paymentList : ArrayList<Payment>) : RecyclerView.Adapter<ProfileViewHolder>()

{

    fun removeTask(position: Int) {
        paymentList.removeAt(position)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val from = LayoutInflater.from(parent.context)
        return ProfileViewHolder(
            from.inflate(R.layout.payment_recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bindView(paymentList[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}