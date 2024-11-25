package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal{
    private int horseId;

    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }


}
