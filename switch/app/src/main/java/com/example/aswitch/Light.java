package com.example.aswitch;

import android.util.Log;

public class Light extends Device implements Switchable{
    public Light(){
        setDeviceName("Light");
    }

    @Override
    public void breakDevice(){
        Log.e(getDeviceName(), "glass everywhere on the floor");
    }

    public void turnOn(){
        Log.e(getDeviceName(), "Now I can see, there are mt keys");
    }

    public void turnOff(){
        Log.e(getDeviceName(), "its too dark in here, I hit my toe");
    }
}
