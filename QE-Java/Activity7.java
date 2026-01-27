package com.example;

public class Activity7 {
    public static void main(String[] args) {

        MountainBike mb = new MountainBike(5, 10, 25);

        System.out.println(mb.bicycleDesc());

        mb.speedUp(20);
        mb.applyBrake(5);
    }
}

