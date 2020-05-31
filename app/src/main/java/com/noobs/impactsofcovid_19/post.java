package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class post extends AppCompatActivity {
    LinearLayout food, eco, unemp, education,mental;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(post.this, MainActivity.class);
                startActivity(i);
            }
        });

        food = findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(post.this, food.class);
                startActivity(i);
            }
        });

        eco = findViewById(R.id.eco);
        eco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(post.this, eco.class);
                startActivity(i);
            }
        });

        unemp = findViewById(R.id.unemp);
        unemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(post.this, unemp.class);
                startActivity(i);
            }
        });

        education = findViewById(R.id.education);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(post.this, edu.class);
                startActivity(i);
            }
        });

        mental = findViewById(R.id.mental);
        mental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(post.this, mental.class);
                startActivity(i);
            }
        });


    }
}