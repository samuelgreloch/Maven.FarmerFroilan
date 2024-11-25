package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {
    @Test

    public void TractorMakeNoise (){
        Tractor tractor = new Tractor(false,true,false);
        String noise = tractor.makeNoise();
        assertEquals("vRoom", noise);
    }


    @Test

    public void VehicleIsRidableTest(){

        Tractor tractor = new Tractor(true, false, true) {

        };

        assertTrue(tractor.isRidable(), "This vehicle is not ridable when it's broken, has no fuel, and is being repaired.");

    }

    @Test

    public void CanOperateTest(){

        Tractor tractor = new Tractor(false, true, false) {

        };

        assertTrue(tractor.canOperate(), "This vehicle can operate when it's not broken, has fuel, and isn't being repaired.");

    }

    @Test

    public void isTractorTest(){

        Tractor tractor = new Tractor(false,true,false) {

        };

        assertTrue(tractor.isTractor(), "The object should be a vehicle.");



    }



    @Test

    public void canHarvestTest(){

        Tractor tractor = new Tractor(false,true,false);

        assert tractor.canHarvest()==true;

    }

}
