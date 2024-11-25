package com.zipcodewilmington.froilansfarm;

public class Vehicle<T extends Rider> implements NoiseMaker,Rideable{


    private Object tractor;

    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public boolean ride() {
        return false;
    }

    @Override
    public boolean canMount() {
        return false;
    }
}
