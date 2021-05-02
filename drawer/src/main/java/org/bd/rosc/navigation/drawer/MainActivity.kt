package org.bd.rosc.navigation.drawer

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import java.security.AccessController

class MainActivity : AppCompatActivity() {

  private lateinit var navController: NavController
  private lateinit var drawerLayout: DrawerLayout
  private lateinit var appBarConfiguration: AppBarConfiguration
  private lateinit var listener: NavController.OnDestinationChangedListener

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    navController = findNavController(R.id.fragment)
    findViewById<NavigationView>(R.id.navigationView).setupWithNavController(navController)

    drawerLayout = findViewById(R.id.drawer_layout)
    appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
    setupActionBarWithNavController(navController, appBarConfiguration)

    listener = NavController.OnDestinationChangedListener { controller, destination, arguments ->
      if (destination.id == R.id.firstFragment) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.red_600)))
      } else if (destination.id == R.id.secondFragment) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.lime_600)))
      }
    }
  }

  override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.fragment)
    return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
  }

  override fun onResume() {
    super.onResume()
    navController.addOnDestinationChangedListener(listener)
  }

  override fun onPause() {
    super.onPause()
    navController.removeOnDestinationChangedListener(listener)
  }
}