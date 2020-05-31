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

public class Deforestation extends AppCompatActivity {
    ImageView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deforestation);


        ImageView backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Deforestation.this, env.class);
                startActivity(i);
            }
        });

        p1 = findViewById(R.id.p1);

        TextView airtext = findViewById(R.id.airtext);

        airtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.globalforestwatch.org/map?analysis=eyJzaG93QW5hbHlzaXMiOnRydWUsImhpZGRlbiI6ZmFsc2V9"));
                startActivity(browserIntent);
            }
        });

        loadImg();

    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);

        Glide.with(this).load("https://cdn-statics.brazilian.report/wp-content/uploads/2020/04/ddedfr.jpg").apply(options).into(p1);
       }
}