package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow<Crop> extends ArrayList<Crop> {

    public CropRow(){
        super();
    }
    public void plant(Crop crop) {
    this.add(crop);
    }


    public boolean hasCrop(Crop crop) {
        return this.contains(crop);
    }

    public void showCrops() {
        for (Crop crop : this){
            System.out.println(crop);
        }
    }

}
