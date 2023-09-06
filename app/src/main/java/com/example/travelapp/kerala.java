package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kerala extends AppCompatActivity {
    String x;
    EditText inputppl;
    Button kerala54;
    Button more_pack;
    Button kerala43;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);


        kerala54= findViewById(R.id.button8);
        kerala43=findViewById(R.id.button9);
        inputppl = findViewById(R.id.editTextText);
        more_pack=findViewById(R.id.packages);

        kerala54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(kerala.this, kerala54.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

        kerala43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(kerala.this, kerala43.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });
    }
    public void more_pack(View view)
    {
        goTOUrl("https://www.keralatourism.org/");

    }
    private void goTOUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}