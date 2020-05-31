package com.noobs.impactsofcovid_19;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout env;
    private RelativeLayout banglaAct;
    private RelativeLayout worldAct;
    private RelativeLayout prevention;
    private RelativeLayout post;
    private ImageView info;


    private TextView greeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        greeting = findViewById(R.id.greeting);

        if(timeOfDay >= 0 && timeOfDay < 12){
            greeting.setText("Good Morning");
        }else if(timeOfDay >= 12 && timeOfDay < 18){
            greeting.setText("Good Afternoon");
        }else if(timeOfDay >= 18 && timeOfDay < 21){
            greeting.setText("Good Evening");
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            greeting.setText("Good Evening");
        }


        worldAct = findViewById(R.id.worldwide);
        worldAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, worldsta.class);
                startActivity(i);
            }
        });

        env = findViewById(R.id.env);
        env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, env.class);
                startActivity(i);

            }
        });

        prevention = findViewById(R.id.prevention);
        prevention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, prevention.class);
                startActivity(i);

            }
        });

        post = findViewById(R.id.post);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, post.class);
                startActivity(i);
            }
        });

        info = findViewById(R.id.credit);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, info.class);
                startActivity(i);
            }
        });








    }
}
