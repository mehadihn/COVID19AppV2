package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class edu extends AppCompatActivity {
    ImageView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);

        ImageView backbutton;
        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(edu.this, post.class);
                startActivity(i);
            }
        });

        p1 = findViewById(R.id.pic1);

        loadImg();


    }


    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://lh3.googleusercontent.com/proxy/gBEOFS2_as-LIjbHdp1EziwKmV-MhGRbpwIc_kYaJsDWOJDJgTa94woUXwSkK7MZopxmClz8EimFMnXfIHmC7tkQsPmDrFLKwLfHMW_k3Zaf6ybH-dX-VvGw1EluRXX-6chtbABM5-CVpa9--lxRhf10mp81cXN90alfHcDfot4rrM96Rw?fbclid=IwAR1ooFF6eD69IIvnBqOfwEr4NozPT5Slml9YKCdKAuaUreYos6rtRjjMt34").apply(options).into(p1);

    }
}