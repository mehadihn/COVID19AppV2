package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class air extends AppCompatActivity {
    private ImageView p1 , p2;
    private TextView airtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air);

        ImageView backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(air.this, env.class);
                startActivity(i);
            }
        });

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        airtext = findViewById(R.id.airtext);

        airtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://waqi.info/"));
                startActivity(browserIntent);
            }
        });

        loadImg();

    }
    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://www.nasa.gov/sites/default/files/thumbnails/image/avg2015-2019_no2_print_w_colorbar_date_print.jpg").apply(options).into(p1);
        Glide.with(this).load("https://www.nasa.gov/sites/default/files/thumbnails/image/2020_no2_w_colorbar_date_print.jpg").apply(options).into(p2);
    }
}