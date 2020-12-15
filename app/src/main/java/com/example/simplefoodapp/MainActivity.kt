package com.example.simplefoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list : ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedItem: Int) {
        when(selectedItem){
            R.id.action_list->{
                showRecyclerList()
            }
            R.id.action_grid->{
                showRecyclerGrid()
            }
        }

    }

    private fun showRecyclerGrid(){
        rvFood.layoutManager = GridLayoutManager(this, 2)
        val gridFoodAdapter = GridFoodAdapter(list)
        rvFood.adapter = gridFoodAdapter
    }

    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        var listFoodAdapter = FoodListAdapter(list)
        rvFood.adapter = listFoodAdapter
    }

}