package com.example.raviranjan.navigation;


import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;



public class Gallery extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    DrawerLayout drawerLayout;
    Toolbar toolbar2;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        viewPager =(ViewPager)findViewById(R.id.view_pager);
        adapter=new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);

    }}