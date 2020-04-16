package com.example.cs125finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    public static String[] quotes = {"With the new day comes new strength and new thoughts.",
            "Obstacles are the cost of greatness.",
            "Don't limit your challenges. Challenge your Limits.",
            "Work for it more than you hope for it.",
            "Work hard in silence. Let your success be your noise.",
            "A winner is a dreamer who never gives up.",
            "Don't count the days, make the days count.",
            "Beauty begins the moment you decide to be yourself.",
            "Be stronger than your strongest excuse.",
            "The only place success comes before work is in the dictionary.",
            "Life is change. Growth is optional. Choose wisely."};

    public static String[] jokes = {"Why do we tell actors to 'break a leg'? Because every play has a cast!",
            "What did the big flower say to the little flower? 'Hi, Bud!'",
            "Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, 'What's the word on the street?'",
            "What do sprinters eat before a race? Nothing... they fast!",
            "How do pickles enjoy a day out? They relish it!",
            "What did the daughter corn ask the mother corn? 'Where's popcorn?'",
            "My wife told me to take the spider out instead of killing him. Went out. Had a few drinks. Nice guy. He's a web designer.",
            "What do you call a pig that does karate? A pork chop!",
            "What did the buffalo say when his son left for college? 'Bison!'",
            "My wife is really mad at the fact that I have no sense of direction. So I packed up my stuff and right."};

    public static String[] compliments = {"You're a gift to those around you.",
            "You are enough.",
            "You light up the room.",
            "You should be proud of yourself.",
            "You're a ray of sunshine on a dreary day.",
            "You're wonderful.",
            "Jokes are funnier when you tell them.",
            "You're like a breath of fresh air.",
            "You're a candle in teh darkness.",
            "Thank you for being you."};

    public static String[] roastAdjectives = {"craven",
            "frothy",
            "gorbellied",
            "",
            "",
            "",
            "",
            "",
            "",
            ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int randomNumber(int max) {
        return (int) (Math.floor(Math.random() * max));
    }

    private String randomQuote() {
        return quotes[randomNumber(10)];
    }

    private String randomJoke() {
        return jokes[randomNumber(10)];
    }

    private String randomCompliment() {
        return compliments[randomNumber(10)];
    }

    // yet to be done: randomTrivia
}
