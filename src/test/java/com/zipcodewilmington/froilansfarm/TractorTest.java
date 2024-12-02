package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {
    @Test

    public void TractorMakeNoise (){
        Tractor tractor = new Tractor(false);
        String noise = tractor.makeNoise();
        assertEquals("vRoom", noise);
    }


    @Test

    public void VehicleIsRidableTest(){

        Tractor tractor = new Tractor(true) {

        };

        assertTrue(tractor.isRidable(), "This vehicle is not ridable when it's broken, has no fuel, and is being repaired.");

    }

    @Test

    public void CanOperateTest(){

        Tractor tractor = new Tractor(false) {

        };

        assertTrue(tractor.canOperate(), "This vehicle can operate when it's not broken, has fuel, and isn't being repaired.");

    }






    @Test


    public void canHarvestTest(){

        CropRow cropRow = new CropRow();
        Tractor tractor = new Tractor(true);
        boolean result = tractor.canHarvest(cropRow);
        assertTrue(result, "This tractor can harvest for the season of corn.");


    }

}
