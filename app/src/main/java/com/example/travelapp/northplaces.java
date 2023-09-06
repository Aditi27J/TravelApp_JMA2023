package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class northplaces extends AppCompatActivity {
Button delhi,leh,kashmir,shimla;
TextView movingtext;
    private static final long DURATION = 6000; // Animation duration in milliseconds
    private static final int DISTANCE = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northplaces);
        delhi = findViewById(R.id.Delhi);
        leh=findViewById(R.id.LehLadakh);
        kashmir = findViewById(R.id.Kashmir);
        shimla=findViewById(R.id.Shimla);
        movingtext=findViewById(R.id.movingText);
        startContinuousAnimation();

        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(northplaces.this, delhi.class);
                startActivity(i);
            }
        });

        leh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(northplaces.this, lehladakh.class);
                startActivity(i);
            }
        });

        kashmir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(northplaces.this, kashmir.class);
                startActivity(i);
            }
        });

        shimla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(northplaces.this, Shimla.class);
                startActivity(i);
            }
        });

    }

    private void startContinuousAnimation() {
        // Calculate the screen width
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        // Create a ValueAnimator to move the text from left to right
        ValueAnimator moveRightAnimator = ValueAnimator.ofFloat(0, screenWidth + DISTANCE);
        moveRightAnimator.setDuration(DURATION);

        moveRightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float) animation.getAnimatedValue();
                movingtext.setTranslationX(value);
            }
        });

        // Create a ValueAnimator to move the text from right to left
        ValueAnimator moveLeftAnimator = ValueAnimator.ofFloat(screenWidth + DISTANCE, 0);
        moveLeftAnimator.setDuration(DURATION);

        moveLeftAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float) animation.getAnimatedValue();
                movingtext.setTranslationX(value);
            }
        });

        // Set up the AnimatorListener to switch between animations
        AnimatorListenerAdapter animatorListener = new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                // Start the next animation when the current one ends
                if (animation == moveRightAnimator) {
                    moveRightAnimator.start();
                } else if (animation == moveLeftAnimator) {
                    moveLeftAnimator.start();
                }
            }
        };

        moveRightAnimator.addListener(animatorListener);
        moveLeftAnimator.addListener(animatorListener);

        // Start the first animation
        moveRightAnimator.start();

    }
}