package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest {



@Test
    public void ChickensInCoopTest1(){
    Store<Chicken> stores = new Store<>();
    ChickenCoop coop = new ChickenCoop();
    List<Chicken> chickens = new ArrayList<>();

    stores.add(new Chicken());
    coop.setChicken(stores);

    Assertions.assertFalse(coop.store.chickens.isEmpty());
    Assertions.assertEquals(1,coop.store.chickens.size());

}

    @Test
    public void ChickensInCoopTest2(){
        Store<Chicken> stores = new Store<>();
        ChickenCoop coop = new ChickenCoop();
        List<Chicken> chickens = new ArrayList<>();

        stores.add(new Chicken());
        stores.add(new Chicken());
        stores.add(new Chicken());
        coop.setChicken(stores);

        Assertions.assertFalse(coop.store.chickens.isEmpty());
        Assertions.assertEquals(3,coop.store.chickens.size());

    }


}
