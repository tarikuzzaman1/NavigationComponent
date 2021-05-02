package org.bd.rosc.navigatio.safe_args

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_first, container, false)
    view.findViewById<TextView>(R.id.textView1).setOnClickListener {
      //Navigation.findNavController(view).navigate(R.id.navigateToSecondFragment)
      val action = FirstFragmentDirections.navigateToSecondFragment(22)
      Navigation.findNavController(view).navigate(action)
    }
    return view
  }
}