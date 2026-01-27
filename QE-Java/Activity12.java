package com.example;

public class Activity12 {

    public static void main(String[] args) {

        Addable ad1 = (a, b) -> (a + b);

        Addable ad2 = (int a, int b) -> {
            return a + b;
        };

        System.out.println("ad1 result: " + ad1.add(10, 20));
        System.out.println("ad2 result: " + ad2.add(30, 40));
    }
}
