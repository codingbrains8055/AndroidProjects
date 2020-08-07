package com.example.aswitch;

import android.util.Log;

public class Fan extends Device implements Switchable{
    public Fan(){
        setDeviceName("Fan");
    }

    @Override
    public void breakDevice(){
        Log.e(getDeviceName(),"bang.....crash oops");
    }

    public void turnOn(){
        Log.e(getDeviceName(), "whoooooooooosh");
    }

    public void turnOff(){
        Log.e(getDeviceName(), "its too hot in here");
    }
}
