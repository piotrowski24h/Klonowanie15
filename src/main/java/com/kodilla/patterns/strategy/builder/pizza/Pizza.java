package com.kodilla.patterns.strategy.builder.pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {



    private final String bottom;
    private final String sauce;
    private  List<String> ingredients = new ArrayList<>();

    public Pizza(String thin, String spicy, String mushrooms, String bottom, String sauce) {
        this.bottom = bottom;
        this.sauce = sauce;
        this.ingredients= new ArrayList<>(ingredients);
    }

    public String getBottom() {
        return bottom;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
