package com.example.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        ArrayAdapter<Drink> drinkArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Drink.drinks);

        //Since we are using ListActivity, the xml file must specify the keyword android while mentioning to a ID.
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(drinkArrayAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_DRINK_NO, (int) id);
                startActivity(intent);
            }
        };

        listView.setOnItemClickListener(itemClickListener);
    }
}
