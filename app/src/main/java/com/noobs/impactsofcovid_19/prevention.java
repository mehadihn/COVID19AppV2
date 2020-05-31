package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class prevention extends AppCompatActivity {
    private ImageView p1, p2, p3;
    private ImageView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(prevention.this, MainActivity.class);
                startActivity(i);
            }
        });

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);

        loadImg();

    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide1.png").apply(options).into(p1);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide1.png").apply(options).into(p2);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide4.png").apply(options).into(p3);
        }
}