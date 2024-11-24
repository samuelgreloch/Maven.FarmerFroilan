package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmFieldTest {

        @Test
        public void testAddCropRow() {
                FarmField field = new FarmField();
                CropRow<CornStalk> cornRow = new CropRow<>();

                field.add(cornRow);
                assertEquals(1, field.size(), "The field has one croprow.");

        }

        @Test
        public void testAddCropRow2() {
                FarmField field = new FarmField();
                CropRow<TomatoPlant> tplant = new CropRow<>();
                field.add(tplant);
                field.add(tplant);
                assertEquals(2, field.size(), "The field has 2 crop rows.");
        }

        @Test
        public void seeFarmFieldContents() {
                FarmField field = new FarmField();
                CropRow<CornStalk> corn = new CropRow<>();
                CropRow<TomatoPlant> tplant = new CropRow<>();
                corn.add(new CornStalk());
                tplant.add(new TomatoPlant());
                field.add(tplant);
                field.add(corn);

                System.out.println("FarmField contains:");
                for (CropRow<?> cropRow : field.getCropRows()) {
                        cropRow.showCrops();
                }
        }
}
