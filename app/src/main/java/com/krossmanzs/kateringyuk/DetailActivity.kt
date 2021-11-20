package com.krossmanzs.kateringyuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_IMG_FOOD = "extra_img_food"
        const val EXTRA_IMG_RATING = "extra_img_rating"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PRICE = "extra_price"
    }

    private var foodImage: Int = 0
    private var foodRating: Int = 0
    private var foodName: String = ""
    private var foodDetail: String = ""
    private var foodPrice: String = ""

    private lateinit var imgFood: ImageView
    private lateinit var imgRating: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDetail: TextView
    private lateinit var tvPrice: TextView
    private lateinit var imgFavorite: ImageView
    private lateinit var btnOrder: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = getString(R.string.detail)

        setUpView()
        getAllExtraData()
        showDetail()
    }

    private fun setUpView() {
        imgFood = findViewById(R.id.img_item_food)
        imgRating = findViewById(R.id.img_item_star)
        tvName = findViewById(R.id.tv_title_food)
        tvDetail = findViewById(R.id.tv_item_detail)
        tvPrice = findViewById(R.id.tv_price)
        imgFavorite = findViewById(R.id.img_favorite)
        btnOrder = findViewById(R.id.btn_order)

        imgFavorite.setOnClickListener(this)
        btnOrder.setOnClickListener(this)
    }

    private fun showDetail() {
        imgFood.setImageResource(foodImage)
        imgRating.setImageResource(foodRating)
        tvName.text = foodName
        tvDetail.text = foodDetail
        tvPrice.text = foodPrice
    }

    private fun getAllExtraData() {
        foodImage = intent.getIntExtra(EXTRA_IMG_FOOD,0)
        foodRating = intent.getIntExtra(EXTRA_IMG_RATING,0)
        foodName = intent.getStringExtra(EXTRA_NAME).toString()
        foodDetail = intent.getStringExtra(EXTRA_DETAIL).toString()
        foodPrice = intent.getStringExtra(EXTRA_PRICE).toString()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_about -> {
                Intent(this,AboutActivity::class.java).also {
                    startActivity(it)
                }
            }
            R.id.action_share -> {
                val text = "Saya ingin membagikan menu $foodName dari Katering Yuk kepada anda :)"

                Intent(Intent.ACTION_SEND).also {
                    it.type = "text/plain"
                    it.putExtra(Intent.EXTRA_SUBJECT,"Share Menu")
                    it.putExtra(Intent.EXTRA_TEXT,text)
                    startActivity(Intent.createChooser(it,"Share Text"))
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_order -> {
                Toast.makeText(this,"$foodName dipesan",Toast.LENGTH_SHORT).show()
            }
            R.id.img_favorite -> {
                Toast.makeText(this,"Berhasil menambahkan $foodName ke dalam menu favorit",Toast.LENGTH_SHORT).show()
            }
        }
    }
}