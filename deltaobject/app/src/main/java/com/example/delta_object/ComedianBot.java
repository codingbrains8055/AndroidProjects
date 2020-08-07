package com.example.delta_object;

import android.util.Log;
import java.util.ArrayList;

public class ComedianBot extends JokeBot{

    public ComedianBot(String aName){
        super(null);
        setName(aName);
        jokesIKnow = JokeWriter.getJokelistTwo();
    }

    public void perfromShow(){
        talk("Good evening! everyone, my name is " + getName());
        talk("why dont I tell some of my favourite jokes?");

        for(Joke joke: jokesIKnow){
            sayJoke(joke);
        }

        talk("Thanks everyone , Good Night");
    }

    @Override
    protected void sayJoke(Joke aJoke) {
        talk(aJoke.getJokeSetup()+"...."+ aJoke.getJokePunchline());
    }
}
