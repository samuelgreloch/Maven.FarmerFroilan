package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EveryMorningRoutineTest {

@Test
    public void ridingEachHorseTest(){
    Stable stable = new Stable();
    Store<Horse> horseList = new Store<>();
    int horseRidden =0;

    for (int i = 1; i <= 10; i++) {
        Horse horse = new Horse(i);
        horseList.add(horse);

    }
    stable.setHorse(horseList);

    for(int i=0; i<stable.getHorse().size(); i++) {
       if(stable.getHorse().get(i).ride()){
            horseRidden++;
       }
    }

    Assertions.assertEquals(10,horseRidden);
    }




  @Test
    public void feedingEachHorse() {
      EarCorn corn = new EarCorn();
      List<Horse> horseList = new ArrayList<>();

      for (int i = 1; i <= 10; i++) {
          Horse horse = new Horse(i);
          //Feeding 3 corns to each Horse
          horse.eat(corn);
          horse.eat(corn);
          horse.eat(corn);

          Assertions.assertEquals(3, horse.numberComsumed(corn));
          System.out.println(horse.numberComsumed(corn));

      }

  }


@Test
    public void froilanBreakFastScenesTest(){
    Person froilan = new Person("Froilan");
    Person person2 = new Person("Froilanda");


    Tomato tomato = new Tomato();
    EarCorn corn = new EarCorn();
    Egg egg = new Egg();


    // 2 tomato
    froilan.eat(tomato);
    froilan.eat(tomato);

    //one corn
    froilan.eat(corn);

    //6 eggs
    froilan.eat(egg);
    froilan.eat(egg);
    froilan.eat(egg);
    froilan.eat(egg);
    froilan.eat(egg);
    froilan.eat(egg);

    Assertions.assertTrue(froilan.hasEaten(tomato));
    Assertions.assertTrue(froilan.hasEaten(corn));
    Assertions.assertTrue(froilan.hasEaten(egg));
    Assertions.assertEquals(2,froilan.numberComsumed(tomato));
    Assertions.assertEquals(1,froilan.numberComsumed(corn));
    Assertions.assertEquals(6,froilan.numberComsumed(egg));

}

    @Test
    public void froilandaBreakFastScenesTest(){

        Person froilanda = new Person("Froilanda");


        Tomato tomato = new Tomato();
        EarCorn corn = new EarCorn();
        Egg egg = new Egg();


        // 1 tomato
        froilanda.eat(tomato);

        //2 corn
        froilanda.eat(corn);
        froilanda.eat(corn);

        //2 eggs
        froilanda.eat(egg);
        froilanda.eat(egg);


        Assertions.assertTrue(froilanda.hasEaten(tomato));
        Assertions.assertTrue(froilanda.hasEaten(corn));
        Assertions.assertTrue(froilanda.hasEaten(egg));

        Assertions.assertEquals(1,froilanda.numberComsumed(tomato));
        Assertions.assertEquals(2,froilanda.numberComsumed(corn));
        Assertions.assertEquals(2,froilanda.numberComsumed(egg));

    }

}
