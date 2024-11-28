package Days;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

public class EstablishingThePlot {
    @Test
    public void FroilanFarmer(){
        Froilan froilan = new Froilan();
        Assert.assertTrue(Froilan instanceof Farmer);
    }

    @Test
    public void FroilanhasFarm(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertTrue(farm != null);
    }

    @Test
    public void FarmFieldTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
       FarmField field = farm.getFarmField();
        Assert.assertTrue(field != null);
    }

    @Test
    public void Farm5CropRows(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        List<CropRow> cropRows = farm.getCropRows;
        Assert.assertEquals(5, field.size());
    }

    @Test
    public void CropRow1Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();
        CropRow cropRow = field.get(0);
        Assert.assertTrue(cropRow instanceof CornRow);
    }


    @Test
    public void CropRow2Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();
        CropRow cropRow = field.get(1);
        Assert.assertTrue(cropRow instanceof CornRow);
    }


    @Test
    public void CropRow3Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();
        CropRow cropRow = field.get(2);
        Assert.assertTrue(cropRow instanceof CropRow);
    }

    @Test
    public void CropRow4Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();
        CropRow cropRow = field.get(3);
        Assert.assertTrue(cropRow instanceof CropRow);
    }


    @Test
    public void CropRow5Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();
        CropRow cropRow = field.get(4);
        Assert.assertTrue(cropRow instanceof CropRow);
    }

    @Test
    public void ChickenCoopsTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        List<ChickenCoop> chickenCoops = farm.getChickenCoops();
        Assert.assertEquals(4, chickenCoops.size());
    }

    @Test
    public void ChickensTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField field = farm.getFarmField();

        Assert.assertEquals(15, farm.getChickenCount());
    }

    @Test
    public void HorseStablesTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        List<HorseStable> horseStables = farm.getHorseStables();
        Assert.assertEquals(3, horseStables.size());
    }

    @Test
    public void HorseTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();

        Assert.assertEquals(15, farm.getHorseCount());
    }

    @Test
    public void FarmVehiclesTest() {
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        List<Vehicle> vehicles = farm.getVehicles();
        Assert.assertEquals(2, vehicles.size());
    }

    @Test
    public void FarmAircraftTest() {
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Aircraft aircraft = farm.getAircraft();
        Assert.assertNotNull(aircraft);
    }

    @Test
    public void FroilandaPilotTest(){
        Froilanda froilanda = new Froilanda();
        Assert.assertTrue(froilanda instanceof Pilot);
    }

    @Test
    public void FroilandaCropdusterTest(){
        Froilanda froilanda = new Froilanda();
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(froilanda.mount(CropDuster));
    }




















}
