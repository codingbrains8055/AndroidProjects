package com.example.notifyapp;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Notification.Builder notification;
    private static final int uniqueId = 40111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notification = new Notification.Builder(this);
        notification.setAutoCancel(true);
    }

    @TargetApi(16)
    public void myButtonClicked(View view){
        notification.setSmallIcon(R.drawable.mango);
        notification.setTicker("This is a ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("This is the title");
        notification.setContentText("Here is the text");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueId, notification.build());
    }
}
