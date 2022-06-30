package com.example.uts_2110062

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_2110062.Model.Mobil
import com.example.uts_2110062.databinding.ActivityDetailMobilBinding

class Detail_mobil_Activity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailMobilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMobilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    fun initView(){
        val data = intent.getParcelableExtra<Mobil>("Mobil")
        binding.imgFoto.setImageResource(data!!.foto)
        binding.tvJudul.text = data.judul
        binding.tvIsi.text = data.isi
        binding.tvPublish.text = data.publish
        binding.tvTanggal.text = data.tanggal

        supportActionBar?.title = "Detail Berita"
    }
}