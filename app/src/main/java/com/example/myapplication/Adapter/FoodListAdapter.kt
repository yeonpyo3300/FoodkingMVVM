package com.example.myapplication.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.menu_recycler.view.*

class FoodListAdapter(foodRecyclerViewInterface: FoodRecyclerViewInterface) :
    RecyclerView.Adapter<FoodListViewHolder>() {

    val TAG : String = "Test log"

    private var foodList = ArrayList<FoodModel>()

    private var foodRecyclerViewInterface: FoodRecyclerViewInterface? = null

    init {
        this.foodRecyclerViewInterface = foodRecyclerViewInterface
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodListViewHolder {
        val from = LayoutInflater.from(parent.context)
        return FoodListViewHolder(
            parent.context,
            this.foodRecyclerViewInterface!!,
            from.inflate(R.layout.menu_recycler, parent, false),
        )
            .also {
                it.itemView.checkbox_menu.setOnCheckedChangeListener { buttonView, checked ->
                    foodList[it.adapterPosition].completed = checked
                    Log.d(TAG, "Checkbox state - box ${it.adapterPosition + 1} $checked")
                }
            }
    }

    override fun onBindViewHolder(holder: FoodListViewHolder, position: Int) {
        holder.bindView(foodList[position])
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun createList(foodList: ArrayList<FoodModel>) {

        this.foodList = foodList

    }
}