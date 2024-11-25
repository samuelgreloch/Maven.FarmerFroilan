package Days;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Tuesday {
    FarmField farmField;
    Trator trator;
    Person<?> Froilan;


    @Test
    public void MorningRoutine(){

    }

    @Test
    public void HarvestingTest(){
        trator.harvest(farmField);

        for (CropRow<?> row : farmField) {
                row.showCrops();
            }
    }
//    public void testHarvestingOnTuesday() {
//        // Froilan uses the Tractor to harvest the crops on Tuesday
//        froilan.useTractorToHarvest(tractor, farm.getField());
//
//        // After harvesting, check that all crops in each row have been harvested
//        for (CropRow row : farm.getField().getCropRows()) {
//            for (Crop crop : row.getCrops()) {
//                assertTrue("Crop should be harvested", crop.hasBeenHarvested());
//            }
//        }
}
//* On `Tuesday`, `Froilan` uses his `Tractor` to `harvest` each `Crop` in each `CropRow`.
//check & make sure:
//Crops are harvested: After the harvest() method is called on the Tractor, all Crop objects in each CropRow should have their hasBeenHarvested flag set to true.
//Crops yield the correct edible objects after being harvested (if applicable).
//Froilan's actions (riding, feeding, and eating) don't interfere with the harvesting process but are part of the test setup.
//Test the Harvesting Process: Ensure that after calling harvest(), the hasBeenHarvested flag of all crops is set to true.