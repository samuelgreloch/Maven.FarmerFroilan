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
    public boolean eat(T edible) {
        if (edible == null) {
            throw new IllegalArgumentException("Cannot eat non edible foods crazy!");
        }
        consumedItems.add(edible);
        return true;
    }

    public boolean hasEaten(T edible) {
        return consumedItems.contains(edible);
    }

//Deepti added
    public int numberComsumed(T edible) {
        int counter=0;
        for(int i=0; i<consumedItems.size(); i++){
            if(consumedItems.get(i).equals(edible)){
                counter ++;
            }
        }

        return counter;
    }
//Deepti added

}
