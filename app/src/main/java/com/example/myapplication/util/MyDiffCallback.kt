//package com.example.util
//
//import androidx.recyclerview.widget.DiffUtil
//import com.example.myapplication.Model.Payment
//
//object MyDiffCallback : DiffUtil.ItemCallback<Payment>() {
//    override fun areItemsTheSame(oldItem: Payment, newItem: Payment): Boolean {
//        return oldItem.hashCode() == newItem.hashCode()
//    }
//
//    override fun areContentsTheSame(oldItem: Payment, newItem: Payment): Boolean {
//        return oldItem == newItem
//    }
//}