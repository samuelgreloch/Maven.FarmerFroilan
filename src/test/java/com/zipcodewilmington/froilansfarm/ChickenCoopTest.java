package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoopTest {



@Test
    public void ChickensInCoopTest1(){
    Store<Chicken> stores = new Store<>();
    ChickenCoop coop = new ChickenCoop();
    List<Chicken> chickens = new ArrayList<>();

    chickens.add(new Chicken());
    coop.setChicken(chickens);

    Assert.assertFalse(coop.getChicken().isEmpty());
    Assert.assertEquals(1,coop.getChicken().size());

}

}
