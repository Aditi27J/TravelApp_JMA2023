package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tamilnadu extends AppCompatActivity {
    String x;
    EditText inputppl;
    Button tamilnadu76;
    Button more_pack;
    Button tamilnadu65;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilnadu);

        tamilnadu76= findViewById(R.id.button8);
        tamilnadu65=findViewById(R.id.button9);
        inputppl = findViewById(R.id.editTextText);
        more_pack=findViewById(R.id.packages);

        tamilnadu76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(tamilnadu.this, tamil76.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

        tamilnadu65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(tamilnadu.this, tamil65.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });
    }
    public void more_pack(View view)
    {
        goTOUrl("https://www.tamilnadutourism.tn.gov.in/");

    }
    private void goTOUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}