package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FarmhousePeopleTest {


    @Test
    public void peopleInFarmhouseTest1(){
        Store<Person> S1 = new Store<>();
        Person P1 = new Person("Person1");
        S1.add(P1);

        FarmHouse house = new FarmHouse();
        house.setPeopleCount(S1);

        Assertions.assertEquals(1,house.store.people.size());
       Assertions.assertFalse(house.store.people.isEmpty());


    }

    @Test
    public void peopleInFarmhouseTest2(){
        Store<Person> S1 = new Store<>();
        Person P1 = new Person("Person1");
        Person P2 = new Person("Person2");
        Person P3 = new Person("Person3");
        S1.add(P1);
        S1.add(P2);
        S1.add(P3);


        FarmHouse house = new FarmHouse();
        house.setPeopleCount(S1);

        Assertions.assertEquals(3,house.store.people.size());
        Assertions.assertFalse(house.store.people.isEmpty());


    }

}
