package com.zoftino.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.navigation.fragment.NavHostFragment;

public class ShoppingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_activity);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.shop_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.products:
                switchNavGraph(R.navigation.shopping_nav_graph);
                return true;
            case R.id.checkout:
                switchNavGraph(R.navigation.checkout_nav_graph);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void switchNavGraph(int navResourceId){
        NavHostFragment finalHost = NavHostFragment.create(navResourceId);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, finalHost)
                .setPrimaryNavigationFragment(finalHost)
                .commit();
    }
}
