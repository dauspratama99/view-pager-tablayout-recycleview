package com.example.uts_2110062

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_2110062.databinding.ActivityTransmisionBinding
import com.google.android.material.tabs.TabLayoutMediator

class Transmision_Activity : AppCompatActivity() {

    private lateinit var binding : ActivityTransmisionBinding
    private lateinit var viewPagerAdapter : ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransmisionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        with(binding){
            viewPager.adapter = viewPagerAdapter
            TabLayoutMediator(tabLayout,viewPager){tab,position ->
                when(position){
                    0 -> tab.text = "A/T Transmision"
                    1 -> tab.text = "M/T Transmision"
                }
            }.attach()
        }
    }
}