package com.zipcodewilmington.froilansfarm;

public  class Vehicle<T extends Rider> implements NoiseMaker, Rideable{
    public static boolean vehcileMakesNoise;

    public Vehicle(boolean b, boolean b1, boolean b2) {
    }

    public Vehicle(String genericVehicle) {
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
    public boolean canMount() {
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean ride() {
        return false;
    }
}
