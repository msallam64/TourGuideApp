package com.example.mohamedsallam.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cairo=(TextView)findViewById(R.id.cairo);
        cairo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, egypt.class);
                startActivity(i);
            }
        });
        TextView france=(TextView)findViewById(R.id.france);
        france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, france.class);
                startActivity(i);
            }
        });
        TextView lebnan=(TextView)findViewById(R.id.lebnan);
        lebnan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, lebnan.class);
                startActivity(i);
            }
        });
        TextView germany=(TextView)findViewById(R.id.germany);
        germany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, german.class);
                startActivity(i);
            }
        });
    }
}
