package org.bd.rosc.navigation.viewpager_onboarding.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


/**
 * Created by Md.Tarikuzzaman on 03-May-2021 12:50 PM, ROSC-II MIS Cell, LGED.
 */
class ViewPagerAdapter(list: ArrayList<Fragment>, fm: FragmentManager, lifecycle: Lifecycle) :
  FragmentStateAdapter(fm, lifecycle) {

  val fragmentList = list

  override fun getItemCount(): Int {
    return fragmentList.size
  }

  override fun createFragment(position: Int): Fragment {
    return fragmentList[position]
  }
}