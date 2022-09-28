package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapter.FoodListAdapter
import com.example.myapplication.Adapter.FoodModel
import com.example.myapplication.Adapter.FoodRecyclerViewInterface
import kotlinx.android.synthetic.main.activity_food_menu.*
import kotlinx.android.synthetic.main.menu_recycler.*
import kotlinx.android.synthetic.main.menu_recycler.view.*
import kotlin.random.Random

class FoodMenuActivity : AppCompatActivity(), FoodRecyclerViewInterface {

    companion object{
        const val TAG : String = "Test log"
    }

    var foodList = ArrayList<FoodModel>()
    private var foodRecyclerViewPosition: Int? = null

    private lateinit var foodListAdapter: FoodListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_menu)

        initializeView()

        foodListAdapter = FoodListAdapter(this)

    }

    private fun initializeView() {
        for (i in 1..15) {
            val foodModel = FoodModel(
                foodName = "Moon cake $i",
                foodPrice = (1..1000).random(),
                completed = false,
                foodImage = "https://thumbnail.image.rakuten.co.jp/@0_mall/glomarket/cabinet/07178412/08756773/imgb08fflcr9l0.jpg?_ex=350x350&s=0&r=1"
            )
            this.foodList.add(foodModel)
        }

        foodListAdapter = FoodListAdapter(this)
        foodListAdapter.createList(foodList)

        recycler_list.apply {
            layoutManager =
                LinearLayoutManager(this@FoodMenuActivity, LinearLayoutManager.VERTICAL, false)
            adapter = foodListAdapter

        }
    }

    // Food list item clicked event
    override fun onItemClicked(position: Int) {
        this.foodRecyclerViewPosition = position
        Log.d(TAG, "item clicked ${position + 1}")
    }

}