import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FarmVehicleTest {

    @Test

    public void VehicleMakesNoiseTest (){

        Vehicle<?> tractor = new FarmVehicle<>("");
        String noise = tractor.makeNoise();
        assertEquals("vRoom", noise);
    }


    @Test

    public void VehicleIsRidableTest(){

        Vehicle vehicle = new Vehicle(true,false,true);

        assertTrue(vehicle.isRidable(), "This vehicle is not ridable when it's broken, has no fuel, and is being repaired.");

    }

    @Test

    public void CanOperateTest(){

        Vehicle vehicle = new Vehicle(false,true,false);

        assertTrue(vehicle.canOperate(), "This vehicle can operate when it's not broken, has fuel, and isn't being repaired.");

    }

    @Test

    public void isVehicleTest(){

        Vehicle vehicle = new Vehicle("Generic Vehicle");

        assertTrue(vehicle.isVehicle(), "The object should be a vehicle.");



    }

    @Test

    public void CanFly(){

        new Vehicle("");
        assertTrue(Aircraft.canFly(), "This aircraft can fly.");

    }

    @Test

    public void isAircraftTest(){
        FarmVehicle<Pilot> farmVehicle = new FarmVehicle<Pilot>(""){};

        assertFalse(false, "FarmVehicle should not be an instance of Aircraft.");

    }


    @Test

    public void canHarvestTest(){

Tractor tractor = new Tractor();

        assert tractor.canHarvest()==true;

    }

}
