package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class delhi extends AppCompatActivity {
Button delhi54;
Button more_pack;
Button delhi32;
//Button delhi76;
String x;
EditText inputppl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
        delhi54 = findViewById(R.id.button8);
        delhi32=findViewById(R.id.button9);
        inputppl = findViewById(R.id.editTextText);
        more_pack=findViewById(R.id.packages);

        delhi54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(delhi.this, delhi_54.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

        delhi32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(delhi.this, delhi_32.class);
                x = inputppl.getText().toString();
                z.putExtra("People",x);
                startActivity(z);
            }
        });

    }
    public void more_pack(View view)
    {
        goTOUrl("https://www.delhitourism.gov.in/delhitourism/index.jsp");

    }
    private void goTOUrl(String url)
    {
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

}