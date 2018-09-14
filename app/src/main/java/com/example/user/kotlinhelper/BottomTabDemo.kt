package com.example.user.kotlinhelper

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.TextView

class BottomTabDemo : AppCompatActivity() {


    /*    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragment(0);
                    return true;
                case R.id.navigation_dashboard:
                    changeFragment(1);
                    return true;
                case R.id.navigation_notifications:
                    changeFragment(2);
                    return true;
            }
            return false;
        }
    };*/
    private var tabNavigation: BottomNavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_tab_demo)
        tabNavigation = findViewById(R.id.tabNavigation)
        tabNavigation!!.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    changeFragment(0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_dashboard -> {
                    changeFragment(1)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_notifications -> {
                    changeFragment(2)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
        changeFragment(0)
    }

    private fun changeFragment(postion: Int) {
        var fragment = Fragment()

        when (postion) {
            0 -> {
                fragment = FragmentDemoOne()
                val args = Bundle()
                args.putString("name", "One")
                fragment.arguments=args
            }
            1 -> {
                fragment = FragmentDemoOne()
                val args1 = Bundle()
                args1.putString("name", "Two")
                fragment.setArguments(args1)
            }
            2 -> {
                fragment = FragmentDemoOne()
                val args2 = Bundle()
                args2.putString("name", "Three")
                fragment.setArguments(args2)
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }

}
