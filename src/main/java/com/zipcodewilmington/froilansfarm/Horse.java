package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable {
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

    public int getHorseId() {
        return horseId;
    }


    @Override
    public boolean canRide() {
        return false;
    }
}
