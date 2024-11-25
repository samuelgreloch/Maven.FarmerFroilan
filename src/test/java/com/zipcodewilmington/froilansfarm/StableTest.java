package com.zipcodewilmington.froilansfarm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
        Assertions.assertEquals(4,stable.getHorse().size());
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

        Assertions.assertFalse(stable.getHorse().isEmpty());
        Assertions.assertEquals(8,stable.getHorse().size());
        horses.clear();
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
