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
    //  List<Horse> horseList = new ArrayList<>();

      for (int i = 1; i <= 10; i++) {
          Horse horse = new Horse(i);
          //Feeding 3 corns to each Horse
          horse.eat(corn);
          horse.eat(corn);
          horse.eat(corn);

          Assertions.assertEquals(3, horse.numberComsumed(corn));

      }

  }


  //*******Froilan Breakfast Scenes*********//
  //Eating 2 Tomato test
@Test
    public void froilanBreakFastScenesTest1(){
    Person froilan = new Person("Froilan");

    Tomato tomato = new Tomato();

    // 2 tomato
    froilan.eat(tomato);
    froilan.eat(tomato);

    Assertions.assertTrue(froilan.hasEaten(tomato));
    Assertions.assertEquals(2,froilan.numberComsumed(tomato));

}

//Eating 1 EarCorn Test
    @Test
    public void froilanBreakFastScenesTest2(){
        Person froilan = new Person("Froilan");

        EarCorn corn = new EarCorn();

        //one corn
        froilan.eat(corn);


        Assertions.assertTrue(froilan.hasEaten(corn));
        Assertions.assertEquals(1,froilan.numberComsumed(corn));


    }


//Eating 6 Eggs Test
    @Test
    public void froilanBreakFastScenesTest3(){
        Person froilan = new Person("Froilan");

        Egg egg = new Egg();

        //6 eggs
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);

        Assertions.assertTrue(froilan.hasEaten(egg));
        Assertions.assertEquals(6,froilan.numberComsumed(egg));

    }


//*******Froilanda Breakfast Scenes*********//

//Froilanda Eating Tomato test
    @Test
    public void froilandaBreakFastScenesTest1(){

        Person froilanda = new Person("Froilanda");

        Tomato tomato = new Tomato();

        // 1 tomato
        froilanda.eat(tomato);

        Assertions.assertTrue(froilanda.hasEaten(tomato));

        Assertions.assertEquals(1,froilanda.numberComsumed(tomato));

    }

 //Froilanda Eating EarCorn Test
    @Test
    public void froilandaBreakFastScenesTest2(){

        Person froilanda = new Person("Froilanda");

        EarCorn corn = new EarCorn();

        //2 corn
        froilanda.eat(corn);
        froilanda.eat(corn);

        Assertions.assertTrue(froilanda.hasEaten(corn));

        Assertions.assertEquals(2,froilanda.numberComsumed(corn));

    }


//Froilanda Eating Egg Test
    @Test
    public void froilandaBreakFastScenesTest3(){

        Person froilanda = new Person("Froilanda");

        Egg egg = new Egg();

        //2 eggs
        froilanda.eat(egg);
        froilanda.eat(egg);

        Assertions.assertTrue(froilanda.hasEaten(egg));

        Assertions.assertEquals(2,froilanda.numberComsumed(egg));

    }

}
