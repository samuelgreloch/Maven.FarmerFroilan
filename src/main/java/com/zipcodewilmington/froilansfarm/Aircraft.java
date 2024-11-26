package com.zipcodewilmington.froilansfarm;
public class Aircraft extends Vehicle<Pilot> {
    public Aircraft(boolean isBroken, boolean hasFuel, boolean isRepaired) {
        super(isBroken, hasFuel, isRepaired);
    }

    public boolean canFly() {
  return true;  }
}
