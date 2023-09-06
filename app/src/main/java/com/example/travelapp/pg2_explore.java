package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pg2_explore extends AppCompatActivity {
Button expindia;
Button expabroad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg2_explore);
        expindia = findViewById(R.id.button2);
        expabroad = findViewById(R.id.button3);
        expindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pg2_explore.this, indiaexplore.class);
                startActivity(intent);
            }
        });

        expabroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(pg2_explore.this, abroadexplore.class);
                startActivity(intent2);
            }
        });
    }
}