package com.example.myapplication.Adapter

import android.view.View
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Payment
import kotlinx.android.synthetic.main.payment_recycler_item.view.*

class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val paymentText = itemView.payment_text

    fun bindView(payment: Payment) {
        paymentText.text = payment.payment
    }


}