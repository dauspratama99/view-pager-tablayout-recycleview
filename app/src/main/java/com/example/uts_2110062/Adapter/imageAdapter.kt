package com.example.uts_2110062.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uts_2110062.databinding.ListSlideBinding
import com.example.uts_2110062.imageData

class imageAdapter(private val items:List<imageData>):RecyclerView.Adapter<imageAdapter.ImageViewHolder>() {
    inner class ImageViewHolder(itemView:ListSlideBinding):RecyclerView.ViewHolder(itemView.root){
        private val binding = itemView

        fun bind(data:imageData){
            with(binding){
                Glide.with(itemView).load(data.imgUrl).into(imgGambar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
       return ImageViewHolder(ListSlideBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}