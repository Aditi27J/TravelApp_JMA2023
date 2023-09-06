package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kashmir extends AppCompatActivity {
    String x;
    EditText inputppl;
    Button kashmir43;
    Button more_pack;
    Button kashmir32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kashmir);
        kashmir43 = findViewById(R.id.button8);
        kashmir32=findViewById(R.id.button9);
        inputppl = findViewById(R.id.editTextText);
        more_pack=findViewById(R.id.packages);

        kashmir43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(kashmir.this, kashmir_43.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

        kashmir32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(kashmir.this, kashmir_32.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });
    }

    public void more_pack(View view)
    {
        goTOUrl("http://www.kashmir-tourism.org/");

    }
    private void goTOUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}