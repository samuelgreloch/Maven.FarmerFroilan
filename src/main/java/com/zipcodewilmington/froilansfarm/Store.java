package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Store<T> extends ArrayList<T> {

    List<Horse> horse = new ArrayList<>();
    List<Chicken> chickens = new ArrayList<>();

    FarmHouse house;
    List<Person> people = new ArrayList<>();
}
