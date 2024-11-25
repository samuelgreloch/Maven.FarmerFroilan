package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Store<Horse>{

    Store store = new Store();

    public void setHorse(List<Horse> horse) {
        store.horse = horse;

       // System.out.println("Number of Horses in 4 stables is: " + store.horse.size());
    }

    public List<Horse> getHorse() {
       // System.out.println("Number of Horses in 4 stables is: " + store.horse.size());
        return store.horse;
    }


    @Override
    public String toString() {
        return "Stable{" +
                "store=" + store +
                ", horse=" + horse +
                '}';
    }
}
