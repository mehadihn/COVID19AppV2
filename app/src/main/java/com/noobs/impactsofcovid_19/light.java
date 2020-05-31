package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class light extends AppCompatActivity {
    ImageView p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

        ImageView backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(light.this, env.class);
                startActivity(i);
            }
        });


        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        TextView airtext = findViewById(R.id.airtext);

        airtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lightpollutionmap.info/"));
                startActivity(browserIntent);
            }
        });

        loadImg();
    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://cdn.earthdata.nasa.gov/conduit/upload/13963/hubei_vir_20200119.png").apply(options).into(p1);
        Glide.with(this).load("https://cdn.earthdata.nasa.gov/conduit/upload/13995/hubei_vir_20200204_new.png").apply(options).into(p2);
    }
}