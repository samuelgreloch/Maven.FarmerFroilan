package Days;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Wed {

//Plant 3 CornStalk.
    @Test
    public void plantCornTest(){
        CropRow<CornStalk> cornPlant = new CropRow<>();
       // FarmField field = new FarmField();
       // CornStalk corn = new CornStalk();
        cornPlant.add(new CornStalk());
        cornPlant.add(new CornStalk());
        cornPlant.add(new CornStalk());
        cornPlant.add(new CornStalk());

        Assertions.assertEquals(4,cornPlant.size());

    }

// Feed each horse 6 EarCorn
    @Test
    public void feedEachHorseTest(){

            EarCorn corn = new EarCorn();

            for (int i = 1; i <= 10; i++) {
                Horse horse = new Horse(i);
                //Feeding 6 corns to each Horse
                horse.eat(corn);
                horse.eat(corn);
                horse.eat(corn);
                horse.eat(corn);
                horse.eat(corn);
                horse.eat(corn);

                Assertions.assertEquals(6, horse.numberComsumed(corn));

            }

        }

}

