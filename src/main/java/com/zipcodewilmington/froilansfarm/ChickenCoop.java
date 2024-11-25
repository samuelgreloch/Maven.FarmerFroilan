package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;


public class ChickenCoop extends Store<Chicken>{
    Store store = new Store();
   // List<Chicken> chickens = new ArrayList<>();

    public void setChicken(List<Chicken> chickens) {
        store.chickens = chickens;
    }

    public List<Chicken> getChicken(){
        return store.chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "store=" + store +
                ", chickens=" + chickens +
                '}';
    }
}
