package com.zipcodewilmington.froilansfarm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class StableTest {

    @Test
    public void horseListTest1(){
        Store<Horse> horseStore = new Store<>();
        Stable stable = new Stable();
       // List<Horse> horses = new ArrayList<>();
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());

        stable.setHorse(horseStore);

        Assertions.assertFalse(stable.store.horse.isEmpty());
        Assertions.assertEquals(4,stable.store.horse.size());
      //  horses.clear();

    }

    @Test
    public void horseListTest2(){
        Store<Horse> horseStore = new Store<>();
        Stable stable = new Stable();
       // List<Horse> horses = new ArrayList<>();
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());

        stable.setHorse(horseStore);

        Assertions.assertFalse(stable.store.horse.isEmpty());
        Assertions.assertEquals(8,stable.store.horse.size());
       // horses.clear();
    }


    @Test
    public void horseListTest3(){
        Stable stable = new Stable();
        List<Horse> horses = new ArrayList<>();

        stable.setHorse(horses);

        Assertions.assertTrue(stable.getHorse().isEmpty());
        Assertions.assertEquals(0,stable.getHorse().size());
        horses.clear();
    }


}
