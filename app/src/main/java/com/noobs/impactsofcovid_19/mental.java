package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class mental extends AppCompatActivity {
    ImageView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental);

        ImageView backbutton;
        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mental.this, post.class);
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

        Glide.with(this).load("https://media.springernature.com/original/springer-static/image/chp%3A10.1007%2F978-981-15-4814-7_16/MediaObjects/498571_1_En_16_Fig6_HTML.png?fbclid=IwAR2JsW3a5qJ1FxL-hmEChrJyHJHHi48zSr74HHzuamlTXXYhPd1HFqBgAqM").apply(options).into(p1);

    }
}