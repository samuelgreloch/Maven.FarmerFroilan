package com.zipcodewilmington.froilansfarm;



public class Tractor extends FarmVehicle<Rider> {
    private boolean canOperate;

    public Tractor(boolean a) {
        super("");
    }


    public String makeNoise() {
   return "vRoom"; }

    public boolean isRidable() {
   return false; }

    public boolean canOperate(boolean canOperate) {
        this.canOperate = canOperate;
   return false; }

    public boolean canHarvest(CropRow cropRow) {
return false;
    }
}
