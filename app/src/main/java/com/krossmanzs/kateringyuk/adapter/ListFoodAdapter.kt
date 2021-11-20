package com.krossmanzs.kateringyuk.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.krossmanzs.kateringyuk.R
import com.krossmanzs.kateringyuk.data.Food

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListFoodViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFoodViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_foods,parent,false)
        return ListFoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListFoodViewHolder, position: Int) {
        val food = listFood[holder.adapterPosition]

        holder.imgPhoto.setImageResource(food.photo)
        holder.imgRating.setImageResource(food.rating)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        holder.tvPrice.text = food.price

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    class ListFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_food)
        var tvName: TextView = itemView.findViewById(R.id.tv_title_food)
        var imgRating: ImageView = itemView.findViewById(R.id.img_item_star)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_price)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}
