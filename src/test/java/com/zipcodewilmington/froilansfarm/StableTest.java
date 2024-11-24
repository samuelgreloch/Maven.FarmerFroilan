package com.zipcodewilmington.froilansfarm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class StableTest {

    @Test
    public void horseListTest1(){
        Stable stable = new Stable();
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());

        stable.setHorse(horses);

        Assertions.assertFalse(stable.getHorse().isEmpty());
        Assert.assertEquals(4,stable.getHorse().size());
      //  horses.clear();

    }

    @Test
    public void horseListTest2(){
        Stable stable = new Stable();
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());
        horses.add(new Horse());

        stable.setHorse(horses);

        Assert.assertFalse(stable.getHorse().isEmpty());
        Assert.assertEquals(8,stable.getHorse().size());
        horses.clear();
    }


    @Test
    public void horseListTest3(){
        Stable stable = new Stable();
        List<Horse> horses = new ArrayList<>();

        stable.setHorse(horses);

        Assert.assertTrue(stable.getHorse().isEmpty());
        Assert.assertEquals(0,stable.getHorse().size());
        horses.clear();
    }


}
