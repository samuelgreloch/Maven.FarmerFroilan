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

    @Test
    public void testYield() {
        EarCorn corn = new EarCorn();
        Produce<EarCorn> crop = new Crop<>(corn);
        crop.fertilize();
        Edible earCorn = crop.yield();

        assertTrue(earCorn instanceof EarCorn, "Yielded an EarCorn");
    }

}
