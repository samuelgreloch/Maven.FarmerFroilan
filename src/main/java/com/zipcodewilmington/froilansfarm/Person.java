package com.zipcodewilmington.froilansfarm;

public class Person implements NoiseMaker, Eater<Edible> {
    public Person(String name) {
    }

    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Hi";
    }
}
