package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal{
    private int horseId;

    public Horse(int horseId) {
        this.horseId = horseId;
    }

    public Horse() {

    }

    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }


}
