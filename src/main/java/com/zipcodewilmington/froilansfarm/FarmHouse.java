package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse extends Store<Person> {
    Store store = new Store();

    public void setPeopleCount(List<Person> people){
        store.people = people;
    }

//    public List<Person> getPersonCount(){
//        return people;
//    }

}
