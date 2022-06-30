package com.example.uts_2110062

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_2110062.databinding.ActivityMainBinding
import com.example.uts_2110062.databinding.ActivitySplashBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMobil.setOnClickListener(){
            intent = Intent(applicationContext, Data_mobil_Activity::class.java)
            startActivity(intent)
        }

        binding.btnTransmisi.setOnClickListener(){
            intent = Intent(applicationContext, Transmision_Activity::class.java)
            startActivity(intent)
        }

        binding.btnBbm.setOnClickListener(){
            intent = Intent(applicationContext, Bbm_Activity::class.java)
            startActivity(intent)
        }

        binding.btnDealer.setOnClickListener(){
            intent = Intent(applicationContext, DealerActivity::class.java)
            startActivity(intent)
        }

    }
}