package com.example.mylistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class CustomAdapter extends ArrayAdapter {
    public CustomAdapter(@NonNull Context context, String [] fruits) {
        super(context, R.layout.custom_row ,fruits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row, parent, false);

        String singleFruitItem = getItem(position).toString();
        TextView myText = (TextView) customView.findViewById(R.id.myText);
        ImageView myImage = (ImageView) customView.findViewById(R.id.imgApple);
        myText.setText(singleFruitItem);
        myImage.setImageResource(R.drawable.mango);
        return customView;

    }
}
