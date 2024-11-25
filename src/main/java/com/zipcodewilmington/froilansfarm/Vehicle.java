package com.zipcodewilmington.froilansfarm;

public class Vehicle<T extends Rider> implements NoiseMaker, Rideable{
    public static boolean vehcileMakesNoise;

    public Vehicle(boolean b, boolean b1, boolean b2) {
    }

    public Vehicle(String genericVehicle) {
    }

    public Vehicle(){


    }

    public boolean isRidable() {
  return true;  }

    public boolean canOperate() {
    return true;}

    public boolean isVehicle() {
   return false; }

    public String makeNoise() {
   return "vroom"; }

    @Override
    public boolean ride() {
        return false;
    }

    @Override
    public boolean canMount() {
        return false;
    }
}
