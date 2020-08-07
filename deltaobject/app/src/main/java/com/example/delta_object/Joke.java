package com.example.delta_object;

public class Joke {
    private String jokeSetup;
    private String jokePunchline;

//    @org.jetbrains.annotations.Contract(pure = true)
    Joke(String setup, String punchline){
        this.jokeSetup = setup;
        this.jokePunchline = punchline;
    }

    public String getJokeSetup() {
        return jokeSetup;
    }

    public void setJokeSetup(String jokeSetup) {
        this.jokeSetup = jokeSetup;
    }

    public String getJokePunchline() {
        return jokePunchline;
    }

    public void setJokePunchline(String jokePunchline) {
        this.jokePunchline = jokePunchline;
    }
}
