package com.example;

public class MountainBike extends Bicycle {

    int seatHeight;

    public MountainBike(int gears, int speed, int seatHeight) {
        super(gears, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int h) {
        seatHeight = h;
    }

    @Override
    public String bicycleDesc() {
        return super.bicycleDesc() + ", Seat Height: " + seatHeight;
    }
}

