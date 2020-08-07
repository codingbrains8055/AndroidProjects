package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int value;
    private Button buttons[][] = new Button[3][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                buttons[i][j] = new Button()
            }
        }
    }
}
