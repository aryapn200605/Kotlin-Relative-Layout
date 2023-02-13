package com.example.relativelayout_arya_12rpl.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.relativelayout_arya_12rpl.R
import com.example.relativelayout_arya_12rpl.model.CategoriesModel

class CategoriesAdapter(val context: Context,val categoryModel: ArrayList<CategoriesModel>) : RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>(){


    interface onSelectData{
        fun onSelected(categoriesModel: CategoriesModel)
    }
    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvKategori = itemView.findViewById<TextView>(R.id.tvKategori)
        val cvKategori = itemView.findViewById<CardView>(R.id.cvKategori)
        val imgKategori = itemView.findViewById<ImageView>(R.id.imgKategori)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflate =  LayoutInflater.from(parent.context).inflate(R.layout.list_item_categories,parent,false)

        return CategoryViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val data = categoryModel.get(position)

        Glide.with(context)
            .load(data.strCategoryThumb)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imgKategori)

        holder.tvKategori.text = data.strCategory


    }

    override fun getItemCount(): Int  = categoryModel.size
}