package com.example.delta_object;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Locale;

public class ObjectActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);

        Bot myBot = new Bot();

        Joke j = new Joke("I wondered why the baseball was getting bigger", "then it hit me");
        Joke anotherJoke = new Joke("I learned sign language","its very handy");

        ArrayList<Joke> someJokes = JokeWriter.getJokeListOne();
        JokeBot jokeBot = new JokeBot(someJokes);
        jokeBot.tellJoke();

        jokeBot.jokesIKnow = JokeWriter.getJokelistTwo();
        jokeBot.jokesIKnow = JokeWriter.getJokeListOne();

        ComedianBot drHilarious = new ComedianBot("DrHilarious");
        drHilarious.perfromShow();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.object, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
