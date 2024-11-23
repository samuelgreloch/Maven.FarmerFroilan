package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    @Test
    void testMakeNoise() {
        Person<?> froilan = new Person<>("Froilan");
        String noise = froilan.makeNoise();
        assertEquals("Hello!", noise);
    }

    @Test
    void testEatEdible() {
        Person<Edible> froilan = new Person<>("Froilan");
        EarCorn earCorn = new EarCorn();
        froilan.eat(earCorn);
        assertTrue(froilan.hasEaten(earCorn));
    }

    @Test
    void testEatThrowsExceptionForNullEdible() {
        // Arrange
        Person<Edible> froilan = new Person<>("Froilan");

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> froilan.eat(null));
    }

    @Test
    void testCreatePersonWithName() {
        // Arrange
        Person<?> froilan = new Person<>("Froilan");
        Person<?> froilanda = new Person<>("Froilanda");

        // Act
        String froilanName = froilan.getName();
        String froilandaName = froilanda.getName();

        // Assert
        assertEquals("Froilan", froilanName);
        assertEquals("Froilanda", froilandaName);
    }



}
