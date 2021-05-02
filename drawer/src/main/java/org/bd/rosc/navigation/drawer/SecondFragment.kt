package org.bd.rosc.navigation.drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

  val args: SecondFragmentArgs by navArgs()

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_second, container, false)
    view.findViewById<TextView>(R.id.textView2).text = args.number.toString()
    view.findViewById<TextView>(R.id.textView2).setOnClickListener {
      Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment)
    }
    return view
  }

}