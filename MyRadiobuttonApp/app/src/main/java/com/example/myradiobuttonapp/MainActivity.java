package com.example.myradiobuttonapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View view){
        TextView textView = findViewById(R.id.myTextView);
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();

        switch (id){
            case R.id.male:
                textView.setText("male");
                break;

            case R.id.female:
                textView.setText("Female");
                break;
        }
    }
}
