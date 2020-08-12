package com.example.mystopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends Activity {
    private boolean running;
    private int seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            running = savedInstanceState.getBoolean("running");
            seconds = savedInstanceState.getInt("seconds");
        }
        runTime();
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
    }
    public void onClickStart(View view){
        running = true;

    }

    public void onClickStop(View view){
        running = false;
    }

    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    private void runTime(){
        final Handler handler = new Handler();
        final TextView timeView = findViewById(R.id.textTime);
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;

                String time = String.format("%02d:%02d:%02d", hours, minutes, secs);

                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}
