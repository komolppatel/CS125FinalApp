package com.example.cs125finalapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class Compliments extends AppCompatActivity {

    public static String[] compliment = {"You're a gift to those around you.",
            "You are enough.",
            "You light up the room.",
            "You should be proud of yourself.",
            "You're a ray of sunshine on a dreary day.",
            "You're wonderful.",
            "Jokes are funnier when you tell them.",
            "You're like a breath of fresh air.",
            "You're a candle in the darkness.",
            "Thank you for being you."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compliments);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView compli = findViewById(R.id.comp);
        compli.setText(randomCompliment());


    }

    private int randomNumber(int length) {
        return (int) (Math.random() * length);
    }

    private String randomCompliment() {
        return compliment[randomNumber(compliment.length)];
    }

}
