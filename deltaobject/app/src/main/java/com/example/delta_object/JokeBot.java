package com.example.delta_object;

import java.util.ArrayList;

public class JokeBot extends Bot {
    public static ArrayList<Joke> jokesIKnow = null;

    public  static void setJokesIKnow(ArrayList<Joke> aJokesIKnow){
        jokesIKnow = aJokesIKnow;
    }

    public JokeBot(ArrayList<Joke> aJokesIknow){
        jokesIKnow = aJokesIknow;
    }

    public void tellJoke(){
        Double randomNumDouble = new Double(Math.random() * jokesIKnow.size());
        int randomNum = randomNumDouble.intValue();

        Joke myJoke = jokesIKnow.get(randomNum);
        sayJoke(myJoke);
    }

    protected void sayJoke(Joke aJoke){
        talk(aJoke.getJokeSetup());
        talk(aJoke.getJokePunchline());
    }
}
