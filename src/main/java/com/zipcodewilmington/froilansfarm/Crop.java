package com.zipcodewilmington.froilansfarm;

public class Crop<T extends Edible> implements Produce<T>{
    private T edible;
    private boolean fertilized;
    private boolean harvested;

    public Crop(T edible) {
        this.edible = edible;
        this.fertilized = false;
        this.harvested = false;
    }


    @Override
    public boolean hasBeenFertilized() {
        return fertilized;
    }

    @Override
    public void fertilize() {
        fertilized = true;
    }

    @Override
    public T yield() {
        if (!fertilized) {
            return null;
        } return edible;
    }


    public void harvest() {
        harvested = true;
    }

    public boolean hasBeenHarvested() {
        return harvested;
    }
}
