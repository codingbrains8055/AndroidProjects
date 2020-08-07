package com.example.myappgest;

import android.gesture.Gesture;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.TextView;
import android.view.GestureDetector;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{



    private TextView myMessage;
    private GestureDetector myGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMessage = (TextView) findViewById(R.id.myMsg);
        this.myGestureDetector = new GestureDetector(this, this);
        myGestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.myGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myMessage.setText("single tap confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myMessage.setText("Double tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myMessage.setText("Double tap event");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myMessage.setText("down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myMessage.setText("show press");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myMessage.setText("single tap up");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myMessage.setText("scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myMessage.setText("long press");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myMessage.setText("fling");
        return false;
    }
}
