package com.example.appintent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "com.example.appintent";
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStart called");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++){
                    long futureTime = System.currentTimeMillis() + 5000;
                    while(System.currentTimeMillis() < futureTime){
                        synchronized (this){
                        try{
                            wait(futureTime-System.currentTimeMillis());
                            Log.i(TAG, "service is running");
                        }catch (Exception e){

                        }

                        }
                    }
                }
            }
        };
        Thread myThread = new Thread(r);
        myThread.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "OnDestroy called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
