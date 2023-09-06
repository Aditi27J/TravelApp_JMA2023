package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class karnataka extends AppCompatActivity {
    String x;
    EditText inputppl;
    Button karnataka76;
    Button more_pack;
    Button karnataka65;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);

        karnataka76= findViewById(R.id.button8);
        karnataka65=findViewById(R.id.button9);
        inputppl = findViewById(R.id.editTextText);
        more_pack=findViewById(R.id.packages);

        karnataka76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(karnataka.this, karnataka_76.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

        karnataka65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(karnataka.this, karnataka_65.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });
    }
    public void more_pack(View view)
    {
        goTOUrl("https://karnatakatourism.org/");

    }
    private void goTOUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}