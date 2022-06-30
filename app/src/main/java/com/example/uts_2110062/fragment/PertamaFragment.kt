package com.example.uts_2110062.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uts_2110062.R
import com.example.uts_2110062.databinding.FragmentPertamaBinding


class PertamaFragment : Fragment() {

    private var _binding: FragmentPertamaBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPertamaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }   override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }




}