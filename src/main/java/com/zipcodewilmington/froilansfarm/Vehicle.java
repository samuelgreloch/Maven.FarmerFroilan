package com.zipcodewilmington.froilansfarm;

public class Vehicle<T extends Rider> implements NoiseMaker,Rideable{


    private Object tractor;

    @Override
    public String makeNoise() {
        return "";
    }
}
