package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class abroadexplore extends AppCompatActivity {
Button europe;
TextView exploreabroad;
Button dubai;
Button singapore;
//Button currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroadexplore);
        europe = findViewById(R.id.europe);
        exploreabroad = findViewById(R.id.intdest);
        dubai = findViewById(R.id.dubai);
        singapore = findViewById(R.id.singapore);
//        currency=findViewById(R.id.button11);

        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(abroadexplore.this, com.example.travelapp.europe.class);
                startActivity(i);
            }
        });
        dubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(abroadexplore.this, com.example.travelapp.dubai.class);
                startActivity(i2);
            }
        });
        singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(abroadexplore.this, singapore.class);
                startActivity(i3);
            }
        });

//        currency.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i4 = new Intent(abroadexplore.this, currency.class);
//                startActivity(i4);
//            }
//        });

    }
}