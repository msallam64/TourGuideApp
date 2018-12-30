package com.example.mohamedsallam.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class egypt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new egyptfragment())
                .commit();
    }
}