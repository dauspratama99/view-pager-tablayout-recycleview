package com.example.uts_2110062

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.uts_2110062.fragment.KeduaFragment
import com.example.uts_2110062.fragment.PertamaFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    :FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fr = Fragment()
        when(position){
            0 -> fr = PertamaFragment()
            1 -> fr = KeduaFragment()
        }
        return fr
    }
}