package com.example.uts_2110062

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_2110062.databinding.ActivityBbmBinding
import com.example.uts_2110062.fragment.PertaliteFragment
import com.example.uts_2110062.fragment.SolarFragment

class Bbm_Activity : AppCompatActivity() {
    private lateinit var binding : ActivityBbmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBbmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fr = supportFragmentManager.beginTransaction()
        fr.add(R.id.fl_page, PertaliteFragment())
        fr.commit()

        binding.btnPertamax.setOnClickListener {
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.fl_page, PertaliteFragment())
            fr.commit()
        }

        binding.btnSolar.setOnClickListener{
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.fl_page, SolarFragment())
            fr.commit()
        }
    }
}