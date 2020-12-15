package com.example.simplefoodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FoodListAdapter(val listFood : ArrayList<Food>) : RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.hero_name)
        var tvDetail : TextView = itemView.findViewById(R.id.hero_detail)
        var imgHero : ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FoodViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.row_item_food, viewGroup, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val hero = listFood[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgHero)

        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail
    }
}