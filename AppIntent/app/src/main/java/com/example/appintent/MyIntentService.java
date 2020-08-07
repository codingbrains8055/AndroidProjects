package com.example.appintent;

import android.app.IntentService;
import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;

import androidx.annotation.Nullable;

import com.google.android.material.tabs.TabLayout;

public class MyIntentService extends IntentService {
    public static final String TAG = "com.example.appintent";
    public MyIntentService(String name) {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "The Service has started");
    }
}
