package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class prevention extends AppCompatActivity {
    private ImageView p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
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
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);
        p10 = findViewById(R.id.p10);
        p11 = findViewById(R.id.p11);
        p12 = findViewById(R.id.p12);

        loadImg();

    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide1.png").apply(options).into(p1);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide6.png").apply(options).into(p2);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide3.png").apply(options).into(p3);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide2.png").apply(options).into(p4);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide5.png").apply(options).into(p5);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide4.png").apply(options).into(p6);
        Glide.with(this).load("https://www.who.int/images/default-source/searo---images/countries/bangladesh/infographics/be-ready/english/slide7.png").apply(options).into(p7);
        Glide.with(this).load("https://www.who.int/images/default-source/health-topics/coronavirus/risk-communications/general-public/protect-yourself/blue-1.tmb-1920v.png").apply(options).into(p8);
        Glide.with(this).load("https://www.who.int/images/default-source/health-topics/coronavirus/risk-communications/general-public/protect-yourself/infographics/masks-infographic---final.tmb-1920v.png").apply(options).into(p9);
        Glide.with(this).load("https://www.who.int/images/default-source/health-topics/coronavirus/risk-communications/home-care-posters/home-care-ill-people-a4-covid.tmb-1920v.png").apply(options).into(p10);
        Glide.with(this).load("https://www.who.int/images/default-source/health-topics/coronavirus/risk-communications/home-care-posters/home-care-everyone-a4-covid.tmb-1920v.png").apply(options).into(p11);
        Glide.with(this).load("https://www.who.int/images/default-source/health-topics/coronavirus/risk-communications/home-care-social-stills/home-care-caregivers-square-covid.tmb-1920v.png").apply(options).into(p12);

    }
}