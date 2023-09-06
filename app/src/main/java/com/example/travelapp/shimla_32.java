package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class shimla_32 extends AppCompatActivity {

    String rppl;
    TextView txt,cost;
    int cost_cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimla32);

        txt=findViewById(R.id.inputppl);
        cost=findViewById(R.id.cost);
        rppl = getIntent().getExtras().getString("People");

        txt.setText(" "+rppl);
        cost_cal=5000*Integer.parseInt(rppl);
        cost.setText(""+cost_cal);
    }
}