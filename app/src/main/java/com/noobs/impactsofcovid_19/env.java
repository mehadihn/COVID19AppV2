package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class env extends AppCompatActivity {
    private ImageView backbutton;
    private LinearLayout air, light, water, deforest, hunting, industry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_env);

        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, MainActivity.class);
                startActivity(i);
            }
        });

        air = findViewById(R.id.air);

        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, air.class);
                startActivity(i);
            }
        });

        water = findViewById(R.id.water);

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, water.class);
                startActivity(i);
            }
        });

        light = findViewById(R.id.light);

        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, light.class);
                startActivity(i);
            }
        });

        deforest = findViewById(R.id.deforest);

        deforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, Deforestation.class);
                startActivity(i);
            }
        });

        hunting = findViewById(R.id.hunting);

        hunting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, Hunting.class);
                startActivity(i);
            }
        });

        industry = findViewById(R.id.industry);

        industry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(env.this, Industry.class);
                startActivity(i);
            }
        });




    }
}