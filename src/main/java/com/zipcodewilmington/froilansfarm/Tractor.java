package com.zipcodewilmington.froilansfarm;



public class Tractor extends FarmVehicle<Rider> {
    public Tractor(boolean b, boolean b1, boolean b2) {
        super("");
    }

    public boolean canHarvest() {
   return true; }


    public String makeNoise() {
   return "vRoom"; }

    public boolean isRidable() {
   return false; }

    public boolean canOperate() {
   return false; }
}
