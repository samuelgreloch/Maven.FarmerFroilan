package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CropRowTest {

    @Test
    public void plantCropTest() {
        // Create a CropRow to store CornStalk objects
        CropRow<CornStalk> cornRow = new CropRow<>();
        CornStalk corn = new CornStalk();
        cornRow.plant(corn);

        assertTrue(cornRow.hasCrop(corn), "Corn was planted in this row.");
    }

    @Test
    public void removeCropTest() {
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        TomatoPlant tplant = new TomatoPlant();
        tomatoRow.plant(tplant);
        assertTrue(tomatoRow.hasCrop(tplant), "Tomato was planted in this row.");

        tomatoRow.remove(tplant);
        assertFalse(tomatoRow.hasCrop(tplant), "Nothing in this row.");
    }

    @Test
    void cropRowContainsTest() {
        CropRow<CornStalk> cornRow = new CropRow<>();
        CornStalk corn = new CornStalk();
        cornRow.plant(corn);

        cornRow.showCrops();
    }
}

