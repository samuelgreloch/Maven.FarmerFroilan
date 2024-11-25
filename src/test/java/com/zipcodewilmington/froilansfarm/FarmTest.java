package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class FarmTest {


//    , many ChickenCoop, and a single FarmHouse
//Stable stores many Horse.
//
//    FarmHouse stores many Person
//

    @Test
    public void  stableCountTest1(){
        //Farm stores many Stable

        ArrayList<Stable> stableList = new ArrayList<>();

        Farm farms = new Farm();
        stableList.add(new Stable());
        farms.setStables(stableList);

        Assertions.assertFalse(farms.getStables().isEmpty());
        Assertions.assertEquals(1,farms.stables.size());

    }

    @Test
    public void  stableCountTest2(){
    Farm farm = new Farm();
    Stable stable = new Stable();
    farm.setStables(stable);

    }

    //    ChickenCoop stores many Chicken
    @Test
    public void chickenCoopCountTest(){
        List<ChickenCoop> chickenCoopList = new ArrayList<>();
        chickenCoopList.add(new ChickenCoop());
        chickenCoopList.add(new ChickenCoop());
        chickenCoopList.add(new ChickenCoop());
        chickenCoopList.add(new ChickenCoop());

        Farm farm = new Farm();
        farm.setChickenCoop(chickenCoopList);

        Assertions.assertEquals(4,farm.getChickenCoops().size());
        Assertions.assertFalse(farm.getChickenCoops().isEmpty());

    }

    @Test
    public void  chickenCoopCountTest2(){
        Farm farm = new Farm();
        ChickenCoop coop = new ChickenCoop();
        farm.setChickenCoops(coop);

    }

    @Test
    public void farmHouseCountTest(){
        Farm farm = new Farm();
        farm.setHouse(new FarmHouse());

       // Assert.assertEquals(1,farm.getHouse().size());
       // Assert.assertFalse(farm.getHouse().isEmpty());

    }




}
