package com.example.cs125finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button compliments;
    private Button roasts;
    private Button joke;
    private Button quote;
    private Button trivias;
    private Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compliments = findViewById(R.id.complimentButton);
        compliments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandom("compliments");
            }
        });
        roasts = findViewById(R.id.roastButton);
        roasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandom("roasts");
            }
        });
        joke = findViewById(R.id.jokeButton);
        joke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandom("jokes");
            }
        });
        quote = findViewById(R.id.quoteButton);
        quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandom("quotes");
            }
        });
        trivias = findViewById(R.id.triviaButton);
        trivias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRandom("trivia");
            }
        });
    }

    public void openRandom(String string) {
        Intent intent = new Intent(this, RandomActivity.class);
        intent.putExtra("type", string);
        startActivity(intent);
    }
    // yet to be written: randomTrivia
}
