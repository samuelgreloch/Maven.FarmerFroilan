package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CornStalkTest {

    @Test
    public void checkInitialState(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.hasBeenFertilized(), "Hasn't been fertilized yet.");

        assertFalse(cornStalk.hasBeenHarvested(), "Hasn't been harvested yet.");
    }

    @Test
    public void checkFertilized(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk();

        cornStalk.fertilize();
        assertTrue(cornStalk.hasBeenFertilized(), "The cornstalk has been fertilized.");
    }

    @Test
    public void checkHarvest(){
        EarCorn earCorn = new EarCorn();
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        cornStalk.harvest();
        assertTrue(cornStalk.hasBeenFertilized(), "The cornstalk has been harvested.");
    }
}
