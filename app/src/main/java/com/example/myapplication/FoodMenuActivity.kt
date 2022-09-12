package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapter.FoodListAdapter
import com.example.myapplication.Adapter.FoodModel
import kotlinx.android.synthetic.main.activity_food_menu.*

class FoodMenuActivity : AppCompatActivity() {

    var foodList = ArrayList<FoodModel>()
    private lateinit var foodListAdapter: FoodListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_menu)

        initializeView()
    }

    private fun initializeView() {
        for (i in 1..15) {
            val foodModel = FoodModel(
                foodName = "Moon cake",
                foodPrice = i,
                completed = false,
                foodImage = "https://thumbnail.image.rakuten.co.jp/@0_mall/glomarket/cabinet/07178412/08756773/imgb08fflcr9l0.jpg?_ex=350x350&s=0&r=1"
            )
            this.foodList.add(foodModel)
        }

        foodListAdapter = FoodListAdapter()
        foodListAdapter.createList(foodList)

        recycler_list.apply {
            layoutManager =
                LinearLayoutManager(this@FoodMenuActivity, LinearLayoutManager.VERTICAL, false)
            adapter = foodListAdapter

        }
    }


}