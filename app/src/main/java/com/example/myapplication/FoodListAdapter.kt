package com.example.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu_recycler.view.*

class FoodListAdapter : RecyclerView.Adapter<FoodListViewHolder>() {

    val TAG = "Test Log"

    private var foodList = ArrayList<FoodModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodListViewHolder {
        val from = LayoutInflater.from(parent.context)
        return FoodListViewHolder(parent.context, from.inflate(R.layout.menu_recycler, parent, false)).also {
            it.itemView.checkbox_menu.setOnCheckedChangeListener { buttonView, checked ->
                foodList[it.adapterPosition].completed = checked
                Log.d(TAG, "Checkbox state - box ${it.adapterPosition + 1} $checked")
            }
        }
    }

    override fun onBindViewHolder(holder: FoodListViewHolder, position: Int) {
        holder.bindView(foodList[position])
        holder.itemView.setOnClickListener {
            Log.d(TAG, "This is the line : ${position + 1}")

        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun createList(foodList: ArrayList<FoodModel>) {

        this.foodList = foodList

    }
}