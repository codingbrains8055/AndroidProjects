package com.example.bmiapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void calcBMI(View view){
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String msg = "";

        EditText et1 = findViewById(R.id.weight);
        EditText et2 = findViewById(R.id.height);

        Button b1 = findViewById(R.id.buttonCalculate);

        TextView t1 = findViewById(R.id.result);
        TextView t2 = findViewById(R.id.bmiStatus);

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi = height * height;
        bmi = weight / bmi;

        t1.setText(String.valueOf(bmi));

        if(bmi < 18.5){
            msg = "Underweight";
        }else if(bmi > 18.5 && bmi < 25){
            msg = "Normal Weight";
        }else{
            msg = "Overweight";
        }

        t2.setText(msg);
    }
}
