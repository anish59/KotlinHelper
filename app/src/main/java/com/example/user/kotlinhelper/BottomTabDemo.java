package com.example.user.kotlinhelper;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BottomTabDemo extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
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
    };
    private android.widget.FrameLayout fragmentHolder;
    private BottomNavigationView navigation;
    private android.widget.RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab_demo);
        this.container = (RelativeLayout) findViewById(R.id.container);
        this.navigation = (BottomNavigationView) findViewById(R.id.navigation);
        this.fragmentHolder = (FrameLayout) findViewById(R.id.fragmentHolder);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        changeFragment(0);
    }

    void changeFragment(int postion) {
        Fragment fragment = new Fragment();

        switch (postion) {
            case 0:
                fragment = new FragmentDemoOne();
                Bundle args = new Bundle();
                args.putString("name", "One");
                fragment.setArguments(args);
                break;
            case 1:
                fragment = new FragmentDemoOne();
                Bundle args1 = new Bundle();
                args1.putString("name", "Two");
                fragment.setArguments(args1);
                break;
            case 2:
                fragment = new FragmentDemoOne();
                Bundle args2 = new Bundle();
                args2.putString("name", "Three");
                fragment.setArguments(args2);
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

}
