package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lehladakh extends AppCompatActivity {
    Button leh54;
    Button more_pack;
    Button leh32;
    //Button delhi76;
    String x;
    EditText inputppl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehladakh);
        leh54=findViewById(R.id.button8);
        leh32=findViewById(R.id.button9);
        inputppl=findViewById(R.id.editTextText);
        more_pack=findViewById(R.id.packages);

        leh54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(lehladakh.this, leh_54.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

        leh32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(lehladakh.this, leh_32.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });


    }
    public void more_pack(View view)
    {
        goTOUrl("https://www.lehladakhtourism.com/");

    }
    private void goTOUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

}