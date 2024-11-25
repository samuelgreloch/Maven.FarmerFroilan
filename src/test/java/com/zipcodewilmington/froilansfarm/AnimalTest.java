package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {
    //Eater can eat an Edible object.
    @Test
    public void EaterCanEatEdibleTest() {
        String name = "Froilan";
        Eater eater = new Person(name);
        Edible edible = new Egg();
        assertTrue(eater.eat(edible));
    }

    //NoiseMaker can makeNoise
    @Test
    public void NoiseMakerCanMakeNoise() {
        String name = "Froilan";
        String noise = "Hello!";
        //To be continued...
        NoiseMaker noiseMaker = new Person(name);
        assertEquals(noise, noiseMaker.makeNoise());

    }

    //Animal is a NoiseMaker and Eater
    @Test
    public void AnimalIsNoiseMakerAndEater() {
        String noise = "Neigh!";
        Animal animal = new Horse();
        NoiseMaker noiseMaker = new Horse();
        Eater eater = new Horse();

        assertEquals(noise, noiseMaker.makeNoise());
        //Make test to test that Animal is an Eater use the concrete Horse class
        // assertTrue(eater.eat())

    }


    //Horse is an Animal and Rideable
    @Test
    public void HorseIsAnimalAndRideable() {

    Animal animal = new Horse();
    Rideable rideable = new Horse();

    assertTrue(rideable.canRide());

    }

    //Chicken is an Animal and a Produce
    Animal animal = new Chicken();
    Produce produce = new Chicken();

    // which yield an EdibleEgg if hasBeenFertilized flag is false.
}
