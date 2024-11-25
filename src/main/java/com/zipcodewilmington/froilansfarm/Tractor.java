package com.zipcodewilmington.froilansfarm;



public class Tractor extends FarmVehicle<Rider> {
    public Tractor(boolean isBroken, boolean hasFuel, boolean isRepaired) {
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

    public boolean isTractor() {
   return true; }
}
