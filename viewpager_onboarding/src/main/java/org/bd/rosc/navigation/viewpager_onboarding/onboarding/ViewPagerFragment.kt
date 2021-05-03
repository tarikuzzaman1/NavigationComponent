package org.bd.rosc.navigation.viewpager_onboarding.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import org.bd.rosc.navigation.viewpager_onboarding.R
import org.bd.rosc.navigation.viewpager_onboarding.onboarding.screens.FirstScreen
import org.bd.rosc.navigation.viewpager_onboarding.onboarding.screens.SecondScreen
import org.bd.rosc.navigation.viewpager_onboarding.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

    val fragmentList = arrayListOf<Fragment>(
      FirstScreen(), SecondScreen(), ThirdScreen()
    )

    val adapter = ViewPagerAdapter(
      fragmentList, requireActivity().supportFragmentManager, lifecycle
    )

    view.findViewById<ViewPager2>(R.id.viewpager).adapter = adapter

    return view
  }
}