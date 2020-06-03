package com.example.starbuzz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "A couple of espresso shots with steamed milk", R.drawable.cappuccino),
            new Drink("Filter", "A couple of espresso shots with steamed milk", R.drawable.filter)
    };

    @Override
    public String toString() {
        return name;
    }
}
