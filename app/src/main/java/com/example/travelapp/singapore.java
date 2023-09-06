package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class singapore extends AppCompatActivity {
Button singapore76;
    String x;
Button singapore65;
Button singaporemore;
EditText inppl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singapore);
        singapore65 = findViewById(R.id.singapore65);
        singapore76 = findViewById(R.id.singapore76);
        singaporemore = findViewById(R.id.singaporemore);
        inppl = findViewById(R.id.editTextText2);


        singapore76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(singapore.this, singapore76.class);
                x = inppl.getText().toString();
                i1.putExtra("People",x);
                startActivity(i1);
            }
        });


        singapore65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(singapore.this, singapore65.class);
                x = inppl.getText().toString();
                i2.putExtra("People",x);
                startActivity(i2);
            }
        });
    }
    public void singapore_more(View view){
        gotoUrl("https://www.visitsingapore.com/en/?cmp=SEM_STB-DC23-1015-SG-SEM_IN_DC_ENG_NA_NONE_NONE_PM-STBBrand-NA_NA_GOOG_SEA_AO_Cross_XTG&gclid=CjwKCAjwkeqkBhAnEiwA5U-uM0A9ZbVE5Fhhr3PjryORjaoxRQkUk3L4C3RNX3fK0_x4KbXJXi8zQxoCyIEQAvD_BwE&gclsrc=aw.ds");
    }
    private void gotoUrl(String url){
        Uri uri=Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}