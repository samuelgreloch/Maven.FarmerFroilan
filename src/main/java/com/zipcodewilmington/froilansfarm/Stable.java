package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Store<Horse>{

     List<Horse> horse= new ArrayList<>();
    Store store = new Store();

    public void setHorse(List<Horse> horse) {
        this.horse = horse;
    }

    public List<Horse> getHorse() {
        return horse;
    }
}
