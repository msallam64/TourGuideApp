package com.example.mohamedsallam.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mohamed on 11/2/17.
 */

public class german  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new germanfragment())
                .commit();
    }
}