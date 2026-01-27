package com.example;

public class activities {

    public static void main(String[] args) {

        Car car = new Car();

        // Assign values
        car.color = "Blue";
        car.transmission = "Manual";
        car.make = 2024;

        // Call methods
        car.displayCharacteristics();
        car.accelerate();
        car.brake();
    }
}
