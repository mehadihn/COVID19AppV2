package com.noobs.impactsofcovid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;



public class worldsta extends AppCompatActivity {
    private TextView worldNewcases, worldRecovered, worldDeath, worldConfirm, asiaConfirm,asiaRecovered,asiaDeath,asiaNewcases;
    private RequestQueue mQueue;
    private ImageView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldsta);

        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(worldsta.this, MainActivity.class);
                startActivity(i);
            }
        });


        worldConfirm = findViewById(R.id.worldConfirm);
        worldRecovered = findViewById(R.id.worldRecovered);
        worldDeath = findViewById(R.id.worldDeath);
        worldNewcases = findViewById(R.id.worldNewcases);


        asiaConfirm = findViewById(R.id.asiaConfirm);
        asiaRecovered = findViewById(R.id.asiaRecovered);
        asiaDeath = findViewById(R.id.asiaDeath);
        asiaNewcases = findViewById(R.id.asiaNewcases);




        mQueue = Volley.newRequestQueue(this);

        worldwide();
        asia();
    }


    private void worldwide() {
        String url = "https://corona.lmao.ninja/v2/all";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    worldConfirm.setText(jsonObject.getString("cases"));
                    worldRecovered.setText(jsonObject.getString("recovered"));
                    worldDeath.setText(jsonObject.getString("deaths"));
                    worldNewcases.setText(jsonObject.getString("todayCases"));



                }catch (JSONException e) {
                    Context context = getApplicationContext();
                    CharSequence text = "Failed to Update";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }

    private void asia() {
        String url = "https://corona.lmao.ninja/v2/continents/asia";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    asiaConfirm.setText(jsonObject.getString("cases"));
                    asiaRecovered.setText(jsonObject.getString("recovered"));
                    asiaDeath.setText(jsonObject.getString("deaths"));
                    asiaNewcases.setText(jsonObject.getString("todayCases"));



                }catch (JSONException e) {
                    Context context = getApplicationContext();
                    CharSequence text = "Failed to Update";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }


}