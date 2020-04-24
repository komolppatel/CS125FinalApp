package com.example.cs125finalapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class Roasts extends AppCompatActivity {

    public static String[] roastFirstAdjectives = {"craven",
            "frothy",
            "gorbellied",
            "lumpish",
            "mangled",
            "puny",
            "rank",
            "spleeny",
            "spongy",
            "venomed"};


    /**
     * An array of strings with Shakespearean adjectives for the second third of the roast.
     */

    public static String[] roastSecondAdjectives = {"bat-fowling",
            "beef-witted",
            "clay-brained",
            "doghearted",
            "fen-sucked",
            "flap-mouthed",
            "milk-livered",
            "pox-marked",
            "sheep-biting",
            "swag-bellied"};


    /**
     * An array of strings with Shakespearean nouns for the final third of the roast.
     */

    public static String[] roastNouns = {"apple-john",
            "barnacle",
            "bum-bailey",
            "death-token",
            "foot-licker",
            "hedge-pig",
            "hugger-mugger",
            "measle",
            "pigeon-egg",
            "scut"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roasts);
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

        TextView roas = findViewById(R.id.roa);
        roas.setText(randomRoast());
    }

    private int randomNumber(int length) {
        return (int) (Math.random() * length);
    }

    private String randomRoast() {
        return "Thou art a " + roastFirstAdjectives[randomNumber(roastFirstAdjectives.length)]
                + ", " + roastSecondAdjectives[randomNumber(roastSecondAdjectives.length)] + " "
                + roastNouns[randomNumber(roastNouns.length)] + ".";
    }

}
