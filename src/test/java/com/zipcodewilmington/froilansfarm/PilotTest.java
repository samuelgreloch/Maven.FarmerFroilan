package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {

    @Test
    void testCreatePilotWithName() {
        // Arrange
        Pilot Froilanda = new Pilot("Froilanda");


        // Act
        String froilandaName = Froilanda.getName();


        // Assert

        assertEquals("Froilanda", froilandaName);

    }

    @Test

    void testMakeNoise() {
        Pilot froilanda = new Pilot("Froilanda");
        String noise = froilanda.makeNoise();
        assertEquals("MAYDAY..HELPPPP", noise);
    }


}