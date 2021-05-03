package com.example.testdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.testdemo.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<Button>(R.id.navToFirst_btn).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_firstFragment)
        }

        view.findViewById<Button>(R.id.navToSecond_btn).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }

        return view
    }

}