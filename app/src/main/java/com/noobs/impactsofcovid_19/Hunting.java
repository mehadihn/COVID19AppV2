package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Hunting extends AppCompatActivity {
    ImageView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunting);

        ImageView backbutton = findViewById(R.id.backbutton);

        // HELLO NIAZ

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Hunting.this, env.class);
                startActivity(i);
            }
        });

        p1 = findViewById(R.id.p1);
        loadImg();
    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://news.psu.edu/sites/default/files/styles/photo_gallery_large/public/SafeHuntingNR.jpg").apply(options).into(p1);
    }
}