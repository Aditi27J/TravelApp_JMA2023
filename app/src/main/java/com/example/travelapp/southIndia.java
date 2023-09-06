package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class southIndia extends AppCompatActivity {
    Button karnataka,tamilnadu,kerala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_india);

        karnataka=findViewById(R.id.Karnataka);
        tamilnadu=findViewById(R.id.Tamilnadu);
        kerala=findViewById(R.id.Kerala);

        karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(southIndia.this, karnataka.class);
                startActivity(i);
            }
        });

        tamilnadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(southIndia.this, tamilnadu.class);
                startActivity(i);
            }
        });

        kerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(southIndia.this, kerala.class);
                startActivity(i);
            }
        });
    }
}