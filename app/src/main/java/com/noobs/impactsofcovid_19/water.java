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

public class water extends AppCompatActivity {
    private ImageView p1;
    private TextView airtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        ImageView backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(water.this, env.class);
                startActivity(i);
            }
        });

        p1 = findViewById(R.id.p1);
        airtext = findViewById(R.id.airtext);

        airtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wqdatalive.com/public/669"));
                startActivity(browserIntent);
            }
        });

        loadImg();
    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://cdn.earthdata.nasa.gov/conduit/upload/14338/ChesapeakeBay.jpg").apply(options).into(p1);
        }
}