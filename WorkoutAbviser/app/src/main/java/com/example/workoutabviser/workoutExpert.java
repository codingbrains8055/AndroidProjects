package com.example.workoutabviser;

import java.util.ArrayList;
import java.util.List;

public class workoutExpert {
    List <String> getWorkout (String workoutTypes){
        List <String> workout = new ArrayList<String>();
        if(workoutTypes.equals("Chest")){
            workout.add("Bench Press");
            workout.add("Cable Fly");
        }

        else if(workoutTypes.equals("Triceps")){
           workout.add("Triceps Extension");
           workout.add("Tricep Dips");
        }

        else if(workoutTypes.equals("Biceps")){
            workout.add("Bicep curls");
            workout.add("Dumbbels lift");
        }

        else if(workoutTypes.equals("Shoulder")){
            workout.add("Jumping jack");
            workout.add("Shoulder press");
        }

        else if(workoutTypes.equals("Abs")){
            workout.add("Abdominal crunches");
            workout.add("Bicycle crunches");
        }
        return workout;
    }
}
