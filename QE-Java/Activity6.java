package com.example;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {

        Plane p = new Plane(10);

        p.add("Devika");
        p.add("Ritesh");

        System.out.println("Take off: " + p.takeOff());
        System.out.println("Passengers: " + p.getNames());

        Thread.sleep(5000);

        p.land();
        System.out.println("Landed: " + p.getLandTime());
    }
}

