package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class europe extends AppCompatActivity {
EditText ppl;
String x;
Button europe12;
Button europe10;
Button europemore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        europe12 = findViewById(R.id.europe12);
        europe10 = findViewById(R.id.europe10);
        europemore= findViewById(R.id.europemore);
        ppl = findViewById(R.id.editTextinputppl);


        europe12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(europe.this, com.example.travelapp.europe12.class);
                x = ppl.getText().toString();
                i.putExtra("People",x);
                startActivity(i);
            }
        });

        europe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(europe.this, com.example.travelapp.europe10.class);
                x = ppl.getText().toString();
                i2.putExtra("People",x);
                startActivity(i2);
            }
        });
    }

    public void europe_more(View view){
        gotoUrl("https://www.thomascook.in/international-tourism/europe");
    }
    private void gotoUrl(String url){
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}