package com.example.sharedprefer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    EditText userNameInput;
    EditText passwordInput;
    TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        myText = findViewById(R.id.myText);
    }

    public void setInfo(View view) {

        SharedPreferences sharedPrefs = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putString("username", userNameInput.getText().toString());
        editor.putString("password", passwordInput.getText().toString());
        editor.apply();
        Toast.makeText(this, "saved", Toast.LENGTH_LONG).show();
    }

    public void getInfo(View view){

        SharedPreferences sharedprefs = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String username = sharedprefs.getString("username","");
        String password = sharedprefs.getString("password", "");
        myText.setText(username + " "+password);
    }
}
