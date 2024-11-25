package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EaterTest {

    @Test
    void eat() {
    EarCorn earCorn = new EarCorn();

    Person person = new Person("");

    boolean result = person.eat(earCorn);


    System.out.println("The person eats an earcorn" +result);
    }
}