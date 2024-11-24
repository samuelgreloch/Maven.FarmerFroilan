package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class ProduceTest {

    @Test
    public void testFertilize() {
        Tomato tomato = new Tomato();
        Produce<Edible> crop = new Crop<>(tomato);
        crop.fertilize();
        assertTrue(crop.hasBeenFertilized(), "Crop was fertilized.");
    }

//    @Test
//    public void testYield() {
//        EarCorn corn = new EarCorn();
//        Produce<Edible> crop = new Crop<>(corn);
//        crop.yield();
//        Assert.assertTrue(crop.yield() instanceof Crop<>(corn));
//    }
}
