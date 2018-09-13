package com.zoftino.navigation;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;

import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

public class ShoppingNavigationDrawerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_nav_drawer_activity);

        NavigationView navigationView = findViewById(R.id.navigationView);
        NavHostFragment navHostFragment = (NavHostFragment)getSupportFragmentManager()
                .findFragmentById(R.id.shop_nav_host_fragment);

        NavigationUI.setupWithNavController(navigationView,
                navHostFragment.getNavController());
    }
}