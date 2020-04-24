package com.example.cs125finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    private Button compliments;
    private Button roasts;
    private Button joke;
    private Button quote;
    private Button trivias;
    private Button again;
    private Button back;

    /**
     * An array of strings with motivational quotes for entries.
     */

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


    /**
     * An array of strings with jokes (and their punch lines) as entries.
     */

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


    /**
     * An array of strings with compliments as entries.
     */

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


    /**
     * An array of strings with Shakespearean adjectives for the first third of the roast.
     */

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
        setContentView(R.layout.activity_random);
        generate();

        again = findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate();
            }
        });
        /*
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }); */

    }

    public void generate() {
        String typ = getIntent().getStringExtra("type");
        TextView butt = findViewById(R.id.randomizer);

        if (typ.equals("compliments")) {
            butt.setText(randomCompliment());
        } else if (typ.equals("roasts")) {
            butt.setText(randomRoast());
        } else if (typ.equals("jokes")) {
            butt.setText(randomJoke());
        } else if (typ.equals("quotes")) {
            butt.setText(randomQuote());
        }
        /*else if (typ.equals("trivia")) {
            //do the second thing
            TextView roas = findViewById(R.id.roa);
            butt.setText((randomFact());
        } */
    }



    /**
     * @param length The length of the array (or List) that you're searching for a random index of.
     * @return The computed random integer.
     */

    private int randomNumber(int length) {
        return (int) (Math.random() * length);
    }


    /**
     * @return The motivational quote at a random index number.
     */

    private String randomQuote() {
        return quotes[randomNumber(quotes.length)];
    }


    /**
     * @return The joke at a random index number.
     */

    private String randomJoke() {
        return jokes[randomNumber(jokes.length)];
    }


    /**
     * @return The compliment at a random index number.
     */

    private String randomCompliment() {
        return compliment[randomNumber(compliment.length)];
    }


    /**
     * @return The Shakespearean roast generated by two adjectives and one noun, each at their own random index numbers.
     */

    private String randomRoast() {
        return "Thou art a " + roastFirstAdjectives[randomNumber(roastFirstAdjectives.length)]
                + ", " + roastSecondAdjectives[randomNumber(roastSecondAdjectives.length)] + " "
                + roastNouns[randomNumber(roastNouns.length)] + ".";
    }


}
