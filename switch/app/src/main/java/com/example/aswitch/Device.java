package com.example.aswitch;

public abstract class Device {
    protected String name;
    protected boolean isOn;

    public String getDeviceName() {
        return name;
    }

    public void setDeviceName(String name) {
        this.name = name;
    }

    public boolean isOn(){
        return isOn;
    }

    public void seton(boolean isOn){
        this.isOn = isOn;
    }

    public abstract void breakDevice();
}
