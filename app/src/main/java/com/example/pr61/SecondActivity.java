package com.example.pr61;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Главная");
        }
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_view);
        bottomNavigationView.setBackground(new ColorDrawable(Color.LTGRAY));
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.redd) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment_1_s fragment1 = new Fragment_1_s();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_second, fragment1, "fragment_red");
                fragmentTransaction.commit();
                actionBar.setTitle("Красный");
            } else if (item.getItemId() == R.id.green) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment_2_s fragment2 = new Fragment_2_s();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_second, fragment2, "fragment_green");
                fragmentTransaction.commit();
                actionBar.setTitle("Зеленый");
            } else if (item.getItemId() == R.id.blue) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment_s_3 fragment3 = new Fragment_s_3();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_second, fragment3, "fragment_blue");
                fragmentTransaction.commit();
                actionBar.setTitle("Голубой");
            }
            return false;
        });



    }
}
