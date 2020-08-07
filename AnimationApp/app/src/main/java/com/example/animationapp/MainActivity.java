package com.example.animationapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ViewGroup myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout = findViewById(R.id.my_view);
        myLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    public boolean onTouch(View v, MotionEvent event){
                        moveButton();
                        return true;
                    }
        }
        );
    }


    public void moveButton(){
        TransitionManager.beginDelayedTransition(myLayout);
        View myButton = findViewById(R.id.my_button);
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        myButton.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        sizeRules.width = 450;
        sizeRules.height = 350;
        myButton.setLayoutParams(sizeRules);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
