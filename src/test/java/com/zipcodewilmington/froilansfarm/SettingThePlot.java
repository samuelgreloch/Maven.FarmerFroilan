package com.zipcodewilmington.froilansfarm;

import com.beust.ah.A;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;

public class SettingThePlot {

    @Test
    public void EaterCanEatEdible(){
        Eater<EarCorn> eater = new Chicken();
        Edible food = new EarCorn();
        Assert.assertTrue(eater.eat(food));
    }

    @Test
    public void NoiseMakerMakeNoise(){
        NoiseMaker noiseMaker = new Chicken();
        String noise = "Cluck";
        Assert.assertEquals(noise, noiseMaker.makeNoise());
    }

    @Test
    public void AnimalIsNoiseMakerMakeNoise(){
        Animal animal = new Chicken();
        Assert.assertTrue(animal instanceof NoiseMaker);
    }

    @Test
    public void AnimalIsEater(){
        Animal animal = new Chicken();
        Assert.assertTrue(animal instanceof Eater);
    }

    @Test
    public void HorseisAnimal(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void ChickenisAnimal(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void ChickenisProduce(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void ChickenYieldFertilized(){
        Chicken chicken = new Chicken();
        chicken.fertilize();
        EdibleEgg edibleEgg = chicken.yield();
        Assert.assertTrue(edible != null);
    }

    @Test
    public void ChickenYieldUnfertilized(){
        Chicken chicken = new Chicken();
        chicken.fertilize();
        EdibleEgg edibleEgg = chicken.yield();
        Assert.assertTrue(edible == null);
    }

    @Test
    public void RiderCanMountRideable(){
        String name = "Froilan";
        Rider rider = new Farmer(name);
        Rideable rideable = new Tractor();
        rider.mount(rideable);

        Assert.assertEquals(rider, rideable.getRider());

    }

    @Test
    public void RiderCanDismountRideable(){

        String name = "Froilan";
        Rider rider = new Farmer(name);
        Rideable rideable = new Tractor();
        rider.mount(rideable);
        rider.dismount(rideable);
        Assert.assertTrue(rideable.getRider()==null);


    }

    @Test
    public void BotanistCanPlant(){
        Botanist botanist = new Farmer("Froilan");
        Crop crop = new TomatoPlant();
        CropRow cropRow = new CropRow();
        botanist.plant(crop, cropRow);
        Assert.assertTrue(cropRow.contains(crop));
    }

    @Test
    public void CropRowCanStoreCrops(){
        ArrayList<Crop> cropRow = new CropRow();
        cropRow.add( new TomatoPlant());
        cropRow.add( new TomatoPlant());
        cropRow.add( new TomatoPlant());
        Assert.assertEquals(3, cropRow.size());

    }

    @Test
    public void FarmFieldCanStoreCrop(){
        ArrayList<CropRow> farmField = new FarmField();
       farmField.add(new CropRow());
        farmField.add(new CropRow());
        farmField.add(new CropRow());
        Assert.assertEquals(3, farmField.size());
    }
    @Test
    public void VehicleisNoiseMaker(){
        Vehicle vehicle = new Tractor();
        Assert.assertTrue(vehicle instanceof NoiseMaker);
    }

    @Test
    public void VehicleisRideable(){
        Vehicle vehicle = new Tractor();
        Assert.assertTrue(vehicle instanceof Rideable);
    }

    @Test
    public void FarmVehicleCanOperate(){
        FarmVehicle vehicle = new Tractor();
        Farm farm = new Farm();

        Assert.assertTrue(vehicle.operate(farm));

    }

    @Test
    public void TractorisFarmVehicle(){
        FarmVehicle tractor = new Tractor();

        Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void TractorCanHarvest(){
        FarmVehicle tractor = new Tractor();
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        cropRow.add(tomatoPlant);
        Assert.assertTrue(tractor.harvest(cropRow) != null);
    }

    @Test
    public void AircraftVehicle(){
        Aircraft aircraft = new CropDuster();
        Assert.assertTrue(aircraft instanceof Vehicle);

    }

    @Test
    public void AircraftFly(){
        Aircraft aircraft = new CropDuster();
        Assert.assertTrue(aircraft.fly());
    }

    @Test
    public void CropDusterisFarmVehicle(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void CropDusterisAircraft(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void CropDustercanFertilizeCropRows(){
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
        Crop crop = new TomatoPlant();
        cropRow.add(crop);
        cropDuster.fertilize(cropRow);
        Assert.assertTrue(crop.hasBeenFertilized());
    }


    @Test
    public void ProduceYieldUnfertilized(){
        Produce produce = new TomatoPlant();
        Assert.assertTrue(produce.yield() == null);

    }


    @Test
    public void ProduceYieldFertilized(){
        Produce produce = new TomatoPlant();
        produce.setHasBeenFertilized(true);
        Assert.assertTrue(produce.yield() instanceof Edible);

    }


    @Test
    public void CropisProduce(){
        Crop crop = new TomatoPlant();
        Assert.assertTrue(crop instanceof Produce);

    }


    @Test
    public void CropYieldUnharvestedUnfertilized(){
        Crop crop = new TomatoPlant();
        Assert.assertTrue(crop.yield() == null);
    }


    @Test
    public void CropYieldHarvestedUnfertilized(){
        Crop crop = new TomatoPlant();
        Crop crop = new TomatoPlant();
        crop.setHasBeenHarvested(false);
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.yield() instanceof Edible);
    }


    @Test
    public void CropYieldHarvestFertilized(){
        Crop crop = new TomatoPlant();
        Crop crop = new TomatoPlant();
        crop.setHasBeenHarvested(true);
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.yield() instanceof Edible);

    }


    @Test
    public void CornstalkCrop(){
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void CornstalkYield(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        Assert.assertTrue(cornStalk.yield() instanceof  EarCorn);

    }

    @Test
    public void TomatoPlantCrop(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assert.assertTrue(tomatoPlant instanceof Crop);


    }
    @Test
    public void TomatoPLantYield(){
        Crop<Tomato> tomatoPlant = new TomatoPlant();
        tomatoPlant.hasBeenFertilized(true);
        Assert.assertTrue(tomatoPlant.yield() instanceof Crop);


    }

    @Test
    public void PersonNoiseMaker(){
        String name = "Froilan";
        NoiseMaker person = new Person(name);
        Assert.assertTrue(person.makeNoise() != null);


    }


    @Test
    public void PersonEat(){
        String name = "Froilan";
        Eater person = new Person(name);
        Edible earCorn = new EarCorn();
        Assert.assertTrue(person.eat(earCorn));

    }


    @Test
    public void FarmerEater(){
        String name = "Froilan";
        Farmer farmer = new Farmer(name);
        Assert.assertTrue(farmer instanceof Eater);

    }

    @Test
    public void FarmerRider(){
        String name = "Froilan";
        Farmer farmer = new Farmer(name);
        Assert.assertTrue(farmer instanceof Rider);

    }
    @Test
    public void Farmerbotanist(){
        String name = "Froilan";
        Farmer farmer = new Farmer(name);
        Assert.assertTrue(farmer instanceof Botanist);

    }
    @Test
    public void FamrerPerson(){
        String name = "Froilan";
        Farmer farmer = new Farmer(name);
        Assert.assertTrue(farmer instanceof Person);


    }
    @Test
    public void ShelterisArrayList(){
        Shelter shelter = new HorseStable();
        Assert.assertTrue(shelter instanceof ArrayList);


    }

    @Test
    public void StableStoresHorses(){
        Shelter<Horse> stable = new HorseStable();
        stable.add(new Horse());

        Assert.assertEquals(2, stable.size());


    }

    @Test
    public void FarmHouseStoresPersons(){
        Shelter<Person> farmhouse = new FarmHouse();
        farmhouse.add(new Farmer("Froilan"));
        farmhouse.add(new Farmer("Froilanda"));

        Assert.assertEquals(2, farmhouse.size());


    }

    @Test
    public void ChickenCoopStoresChickens(){
        Shelter<Chicken> chickencoop = new ChickenCoop();
        chickencoop.add(new Chicken());
        chickencoop.add(new Chicken());

        Assert.assertEquals(2, chickencoop.size());

    }


    @Test
    public void FarmStables(){
        Farm farm = new Farm();
        farm.addStable(new HorseStable());
        farm.addStable(new HorseStable());
        ArrayList<HorseStable> stables = farm.getStables();
        Assert.assertEquals(2, stables.size());
    }

    @Test
    public void FarmChickenCoops(){
        Farm farm = new Farm();
        farm.addChickenCoop(new ChickenCoop());
        farm.addChickenCoop(new ChickenCoop());
        ArrayList<ChickenCoop> chickenCoops = farm.getChickenCoops();
        Assert.assertEquals(2, chickenCoops.size());
    }
    @Test
    public void FarmFarmHouse(){
        Farm farm = new Farm();
       Assert.assertTrue(farm.getFarmHouse() instanceof FarmHouse);
    }














}
