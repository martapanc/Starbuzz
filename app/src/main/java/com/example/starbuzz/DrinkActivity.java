package com.example.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINK_NO = "drinkNo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINK_NO);
        Drink drink = Drink.drinks[drinkNo];

        ImageView photoView = (ImageView) findViewById(R.id.photo);
        photoView.setImageResource(drink.getImageResourceId());
        photoView.setContentDescription(drink.getName());

        TextView nameView = findViewById(R.id.name);
        nameView.setText(drink.getName());

        TextView descriptionView = findViewById(R.id.description);
        descriptionView.setText(drink.getDescription());
    }
}
