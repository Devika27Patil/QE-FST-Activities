package com.example;

public class Bicycle implements BicyclesParts, BicyclesOperations {

    int gears;
    int speed;

    public Bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;
    }

    public void applyBrake(int dec) {
        speed = speed - dec;
    }

    public void speedUp(int inc) {
        speed = speed + inc;
    }

    public String bicycleDesc() {
        return "Gears: " + gears + ", Max Speed: " + maxSpeed;
    }
}

