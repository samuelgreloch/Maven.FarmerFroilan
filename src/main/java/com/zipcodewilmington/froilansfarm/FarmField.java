package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmField extends Store<CropRow>{
    List<CropRow<?>> cropRows = new ArrayList<>();

    public FarmField() {
        cropRows = new ArrayList<>();
    }

    public void add(CropRow<?> cropRow) {
        cropRows.add(cropRow);
    }

    public List<CropRow<?>> getCropRows(){
        return cropRows;
    }
}
