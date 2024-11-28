package Days;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Monday {

 @Test
    public void FroilanRideHorses(){
     Froilan froilan = new Froilan();
     Farm farm = froilan.getFarm();
     List<HorseStables> horseStables = farm.getHorseStables();

     for(HorseStable horses: horseStables){
         for (Horse horse: horses){
             Assert.assertTrue(froilan.mount(horse));
             Assert.assertTrue(froilan.dismount(horse));
         }
     }
 }

    @Test
    public void FroilandaRideHorses(){
        Froilanda froilanda = new Froilanda();
        Farm farm = froilan.getFarm();
        List<HorseStables> horseStables = farm.getHorseStables();

        for(HorseStable horses: horseStables){
            for (Horse horse: horses){
                Assert.assertTrue(froilanda.mount(horse));
                Assert.assertTrue(froilanda.dismount(horse));
            }
        }
    }

    @Test
    public void FroilanFeedHorses(){
        Froilanda froilanda = new Froilanda();
        Farm farm = froilan.getFarm();
        List<HorseStables> horseStables = farm.getHorseStables();

        for(HorseStable horses: horseStables){
            for (Horse horse: horses){

               Assert.assertTrue(horse.eat(EarCorn));
                Assert.assertTrue(horse.eat(EarCorn));
                Assert.assertTrue(horse.eat(EarCorn));
            }
        }
    }



    @Test
    public void FroilandaEatBreakfast(){
     Froilan froilan = new Froilan();
     froilan.eat(new EarCorn());
        froilan.eat(new EarCorn());
        froilan.eat(new EarCorn());
        froilan.eat(new EarCorn());
        froilan.eat(new EarCorn());
        froilan.eat(new EarCorn());
        froilan.eat(new EarCorn());

    }


    @Test
    public void FroilanPlantCrops(){
        Froilan froilan = new Froilan();
        FarmField field = froilan.getFarm().getFarmField();
        Assert.assertTrue(froilan.plant(new CornStalk(), field.get(0)));
        Assert.assertTrue(froilan.plant(new TomatoPlant(), field.get(1)));
        Assert.assertTrue(froilan.plant(new TomatoPlant(), field.get(2)));

    }

    @Test
    public void FroilandaFertilizeCropRows(){
        Froilan froilan = new Froilan();
        Froilanda froilanda = new Froilanda();
        Farm farm = froilan.getFarm();
        CropDuster cropDuster = (CropDuster) farm.getAircraft();
        froilanda.mount(cropDuster);
        List<CropRow> field = farm.getFarmField();
        for (CropRow cropRow: field){
            cropDuster.fertilize(cropRow);
            for (Crop crop: List<Crop> cropRow){
                Assert.assertTrue(crop.hasBeenFertilized());
            }
        }



    }














}
