package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Store<Chicken>{
//Store store = new Store();
    List<Chicken> chickens = new ArrayList<>();

    public void setChicken(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public List<Chicken> getChicken(){
        return chickens;
    }
}
