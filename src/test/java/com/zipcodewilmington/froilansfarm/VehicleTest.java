package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VehicleTest {



    @Test

    public void VehicleIsRidableTest(){

        Vehicle<Rider>  vehicle = new Vehicle<>(true,false,true);

        assertTrue(vehicle.isRidable(), "This vehicle is not ridable when it's broken, has no fuel, and is being repaired.");

    }

    @Test

    public void CanOperateTest(){

       Vehicle<Rider> vehicle = new Vehicle<>(false,true,false);

        assertTrue(vehicle.canOperate(), "This vehicle can operate when it's not broken, has fuel, and isn't being repaired.");

    }

    @Test

    public void isVehicleTest(){

        Vehicle<Rider> vehicle = new Vehicle<>("Generic Vehicle");

        assertTrue(vehicle.isVehicle(), "The object should be a vehicle.");



    }

    @Test

    public void CanFly(){
        Aircraft aircraft = new Aircraft(true,false,true);
        aircraft.canFly();
        assertTrue(aircraft.canFly(), "This aircraft can fly.");

    }

    @Test

    public void isAircraftTest(){
        FarmVehicle<Pilot> farmVehicle = new FarmVehicle<Pilot>("");

        assertFalse(farmVehicle.isVehicle(), "FarmVehicle should not be an instance of Aircraft.");

    }



    }
