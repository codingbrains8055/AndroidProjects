package com.example.workoutabviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {
    private workoutExpert expert = new workoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View view){
        TextView workouts = (TextView) findViewById(R.id.workout);
        Spinner workoutType = (Spinner) findViewById(R.id.workoutType);
        String workout = String.valueOf(workoutType.getSelectedItem());
        //workouts.setText(workout);
        List <String> worlkoutList = expert.getWorkout(workout);

        StringBuilder worksoutFormatter = new StringBuilder();
         for(String work: worlkoutList){
             worksoutFormatter.append(work).append('\n');
         }
         workouts.setText(worksoutFormatter);

    }
}
