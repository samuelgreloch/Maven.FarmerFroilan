package Days;

import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.Horse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Wed {

//Plant Corn on cropRow 4
    @Test
    public void plantCornTest(){





    }

// Feed each horse 6 EarCorn
    @Test
    public void feedEachHorseTest(){

            EarCorn corn = new EarCorn();
            //  List<Horse> horseList = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                Horse horse = new Horse(i);
                //Feeding 3 corns to each Horse
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

