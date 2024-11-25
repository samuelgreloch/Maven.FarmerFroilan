package com.zipcodewilmington.froilansfarm;
public class Aircraft extends Vehicle<Pilot> {
    public Aircraft(boolean b, boolean b1, boolean b2) {
        super(b, b1, b2);
    }

    public boolean canFly() {
  return true;  }
}
