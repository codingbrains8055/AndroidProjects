package com.example.cofeebus;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ListView listDriks = getListView();
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks
        );
        listDriks.setAdapter(listAdapter);
    }

    public void onItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }
}
