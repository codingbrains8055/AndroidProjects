package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);

        myLayout.setBackgroundColor(Color.BLUE);
        myButton.setBackgroundColor(Color.RED);
        myButton.setText("Button");

        RelativeLayout.LayoutParams buttonDdetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonDdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDdetails.addRule(RelativeLayout.CENTER_VERTICAL);

        myLayout.addView(myButton, buttonDdetails);

        EditText userName = new EditText(this);

        myButton.setId(1);
        userName.setId(2);

        RelativeLayout.LayoutParams userNameDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        userNameDetails.addRule(RelativeLayout.ABOVE, myButton.getId());
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        userName.setWidth(px);
        userNameDetails.setMargins(0, 0, 0, 35);
        myLayout.addView(userName, userNameDetails);

        setContentView(myLayout);
    }
}
