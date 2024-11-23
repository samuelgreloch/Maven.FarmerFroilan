package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Person<T extends Edible> implements NoiseMaker, Eater<T> {
    private String name;
    private List<T> consumedItems = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String makeNoise() {
        return "Hello!"; // Default noise for a Person
    }

    @Override
    public void eat(T edible) {
        if (edible == null) {
            throw new IllegalArgumentException("Cannot eat null.");
        }
        consumedItems.add(edible);
    }

    public boolean hasEaten(T edible) {
        return consumedItems.contains(edible);
    }
}
