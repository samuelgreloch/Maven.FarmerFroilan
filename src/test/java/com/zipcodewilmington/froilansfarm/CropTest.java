package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {


    @Test
    public void testFertilization() {
        Tomato tomato = new Tomato();
        Crop<Edible> crop = new Crop<>(tomato);
        assertFalse(crop.hasBeenFertilized(), "Crop should not be fertilized initially.");
        crop.fertilize();
        assertTrue(crop.hasBeenFertilized(), "Crop should be fertilized after calling fertilize.");
    }


    @Test
    public void testYieldAfterFertilization() {
        Tomato tomato = new Tomato();
        Crop<Tomato> tomatoPlant = new Crop<>(tomato);
        tomatoPlant.fertilize();
        Edible item = tomatoPlant.yield();
        assertNotNull(item, "The crop should yield an edible item after fertilization.");
    }

    @Test
    public void testHarvest() {
        EarCorn corn = new EarCorn();
        Crop<EarCorn> cornStalk = new Crop<>(corn);
        cornStalk.harvest();
        assertTrue(cornStalk.hasBeenHarvested(), "The Cornstalk has been harvested.");
    }
}
