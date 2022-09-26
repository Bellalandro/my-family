package com.bellalg.bminumpicker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomBar=findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomBar.setOnItemSelectedListener {
            if (it.itemId == R.id.home) {
                inflateFragment(HomeFragment.newInstance())

            } else if (it.itemId == R.id.gourd) {
                inflateFragment(GourdFragment.newInstance())

            }else if (it.itemId == R.id.dashboard) {
                inflateFragment(DashboardFragment.newInstance())

            }else if (it.itemId == R.id.profile) {
                inflateFragment(ProfileFragment.newInstance())

            }



            true
        }
    }



    private fun inflateFragment(fragment: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()

    }
}