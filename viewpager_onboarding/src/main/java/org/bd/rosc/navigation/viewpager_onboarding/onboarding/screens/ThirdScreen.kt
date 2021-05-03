package org.bd.rosc.navigation.viewpager_onboarding.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import org.bd.rosc.navigation.viewpager_onboarding.R

class ThirdScreen : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_third, container, false)

    view.findViewById<TextView>(R.id.finish).setOnClickListener {
      findNavController().navigate(R.id.viewPagerFragmentToHomeFragment)
      onBoardingFinished()
    }

    return view
  }

  private fun onBoardingFinished() {
    val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
    val editor = sharedPref.edit()
    editor.putBoolean("Finished", true)
    editor.apply()
  }
}