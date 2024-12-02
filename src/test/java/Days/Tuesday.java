package Days;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Tuesday {

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
    public void FroilanHarvestCrops(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();
        Tractor tractor = farm.getTractor();
        froilan.mount(tractor);

        for (CropRow cropRow: cropRows){
            List<Edible> edibles = tractor.harvest(cropRow);
            Assert.assertTrue(edibles.size() > 0);
        }

    }
}
