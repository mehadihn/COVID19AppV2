package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class unemp extends AppCompatActivity {
    ImageView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unemp);

        ImageView backbutton;
        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(unemp.this, post.class);
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

        Glide.with(this).load("https://assets.weforum.org/editor/responsive_large_webp_lFOsvoZj7_fLn2itik0uKz35_DZEMBB2hgKYphaxOuw.webp").apply(options).into(p1);

    }
}