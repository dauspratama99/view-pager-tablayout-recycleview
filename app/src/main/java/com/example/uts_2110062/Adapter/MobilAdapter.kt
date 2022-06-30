package com.example.uts_2110062.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_2110062.Detail_mobil_Activity
import com.example.uts_2110062.Model.Mobil
import com.example.uts_2110062.R

class MobilAdapter(val context: Context):RecyclerView.Adapter<MobilAdapter.MobilViewHolder>() {

    private val mobil:MutableList<Mobil> = mutableListOf()

    override fun getItemCount(): Int {
        return mobil.size
    }

    override fun onBindViewHolder(holder: MobilAdapter.MobilViewHolder, position: Int) {
        holder.binmodel(mobil[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilViewHolder {
        return MobilViewHolder(LayoutInflater.from(context).inflate(R.layout.list_data_mobil,parent,false))
    }

    inner class MobilViewHolder(item: View):RecyclerView.ViewHolder(item){
        val imgFoto: ImageView = item.findViewById(R.id.img_foto)
        val txtjudul: TextView = item.findViewById(R.id.tv_judul)
        val txtisi: TextView = item.findViewById(R.id.tv_isi)

        val cardViewData: CardView = item.findViewById(R.id.cv_data_mobil)

        fun binmodel(m:Mobil){
            imgFoto.setImageResource(m.foto)
            txtjudul.text = m.judul
            txtisi.text = m.publish


            cardViewData.setOnClickListener{
                Intent(context, Detail_mobil_Activity::class.java).apply {
                    putExtra("Mobil",m)
                    context.startActivity(this)
                }

            }
        }
    }

    fun setListDataMobil(data:List<Mobil>){
        mobil.clear()
        mobil.addAll(data)
        notifyDataSetChanged()
    }
}