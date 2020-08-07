package com.example.delta_object;

import android.util.Log;

public class Bot {
    public final static String creatorName = "Spawrks";
    private String name = "ROBOT";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void talk(String whatToSay){
//        System.out.println(whatToSay);
        Log.e(getName(), whatToSay);
    }
}
