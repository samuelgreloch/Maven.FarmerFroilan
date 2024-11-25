package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChickenCoopTest {


@Test
    public void ChickensInCoopTest1(){
    Store<Chicken> stores = new Store<>();
    ChickenCoop coop = new ChickenCoop();
   // List<Chicken> chickens = new ArrayList<>();

    stores.add(new Chicken());
    coop.setChicken(stores);

    Assertions.assertFalse(coop.store.chickens.isEmpty());
    Assertions.assertEquals(1,coop.store.chickens.size());

}

    @Test
    public void ChickensInCoopTest2(){
        Store<Chicken> stores = new Store<>();
        ChickenCoop coop = new ChickenCoop();
       // List<Chicken> chickens = new ArrayList<>();

        stores.add(new Chicken());
        stores.add(new Chicken());
        stores.add(new Chicken());
        coop.setChicken(stores);

        Assertions.assertFalse(coop.store.chickens.isEmpty());
        Assertions.assertEquals(3,coop.store.chickens.size());

    }

    //Adding 15 Chickens across 4 Coops
    @Test
    public void addChickenToCoopTest3(){
        ChickenCoop coop = new ChickenCoop();
        Store<Chicken> chickenList = new Store<>();


        for (int i = 1; i <= 15; i++) {
            Chicken chik = new Chicken(i);
            chickenList.add(chik);

        }
        coop.setChicken(chickenList);

        Assertions.assertEquals(15,coop.getChicken().size());

    }



    //Adding 10 Chickens across 4 Coops
    @Test
    public void addChickenToCoopTest(){
        ChickenCoop coop = new ChickenCoop();
        Store<Chicken> chickenList = new Store<>();


        for (int i = 1; i <= 10; i++) {
            Chicken chik = new Chicken(i);
            chickenList.add(chik);

        }
        coop.setChicken(chickenList);

        Assertions.assertEquals(10,coop.getChicken().size());

    }

}
