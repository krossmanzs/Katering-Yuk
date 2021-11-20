package com.krossmanzs.kateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.krossmanzs.kateringyuk.data.Food
import com.krossmanzs.kateringyuk.data.FoodsData
import com.krossmanzs.kateringyuk.adapter.ListFoodAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvFood: RecyclerView
    private var listFood: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_foods)
        rvFood.setHasFixedSize(true)

        listFood.addAll(FoodsData.listFood)
        showListFood()
    }

    private fun showListFood() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(listFood)
        rvFood.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Food) {
                val intent = Intent(this@MainActivity,DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_IMG_FOOD,data.photo)
                intent.putExtra(DetailActivity.EXTRA_IMG_RATING,data.rating)
                intent.putExtra(DetailActivity.EXTRA_NAME,data.name)
                intent.putExtra(DetailActivity.EXTRA_DETAIL,data.detail)
                intent.putExtra(DetailActivity.EXTRA_PRICE,data.price)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_about -> {
                Intent(this,AboutActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}