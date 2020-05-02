package com.example.cs125finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class TriviaActivity extends AppCompatActivity {

    public static final String API_BASE = "http://numbersapi.com/random?min=1&max=50?json";
    private RequestQueue jsonRequest = null;
    private String trivia;
    private Button backHome;
    private Button generateTrivia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        backHome = findViewById(R.id.backHome);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TriviaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        generateTrivia = findViewById(R.id.generateTrivia);
        generateTrivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                triviaMaker();
            }
        });
    }
    private void triviaMaker() {

        TextView triviaStuff = findViewById(R.id.triviaText);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, API_BASE, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            trivia = response.getString("text");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        jsonRequest.add(request);
        triviaStuff.setText(trivia);
    }
}
