package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal {
    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Nay!";
    }
}
