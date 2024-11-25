package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal implements Rideable{
    private int horseId;

//Deepti added
    private List<Edible> consumedItems = new ArrayList<>();

    public Horse(int horseId) {
        this.horseId = horseId;
    }

    public Horse() {

    }


    public int numberComsumed(Edible edible) {
        int counter=0;
        for(int i=0; i<consumedItems.size(); i++){
            if(consumedItems.get(i).equals(edible)){
                counter ++;
            }
        }

        return counter;
    }

//Deepti Added method statements
    @Override
    public boolean eat(Edible edible) {
        if (edible == null) {
            throw new IllegalArgumentException("Cannot eat null.");
        }
        consumedItems.add(edible);
        return true;
    }

    public boolean hasEaten(Edible edible) {
        return consumedItems.contains(edible);
    }
    //Deepti added


    @Override
    public String makeNoise() {
        return "Neigh!";
    }


 //Deepti added
    @Override
    public boolean ride() {
        return true;
    }

    @Override
    public boolean canMount() {
        return true;
    }
//Deepti added

}


