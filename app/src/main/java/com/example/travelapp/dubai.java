package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dubai extends AppCompatActivity {
Button dubai65;
Button dubai54;
Button expmore;
EditText inppl;

String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai);
        dubai65 = findViewById(R.id.dubai65);
        dubai54 = findViewById(R.id.dubai54);
        expmore = findViewById(R.id.dubaimore);
        inppl = findViewById(R.id.editTextinput);

        dubai65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dubai.this, com.example.travelapp.dubai65.class);
                x = inppl.getText().toString();
                i.putExtra("People",x);
                startActivity(i);
            }
        });

        dubai54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(dubai.this, com.example.travelapp.dubai54.class);
                x = inppl.getText().toString();
                i2.putExtra("People", x);
                startActivity(i2);
            }
        });

    }
    public void dubai_more(View view){
        gotoUrl("https://www.visitdubai.com/en/plan-your-trip?DTCM-SN+%7C+India+%7C+Search+%7C+EN+%7C+Brand&gclid=Cj0KCQjw7uSkBhDGARIsAMCZNJsHJ79gE9HjbFl4jwk7yWWa9ZziD7RYcGJGiwHPiz10P_endOORaw8aAsWeEALw_wcB&gclsrc=aw.ds");
    }
    private void gotoUrl(String url){
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}