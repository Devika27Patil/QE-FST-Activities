package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integers:");

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        if (!list.isEmpty()) {
            int index = indexGen.nextInt(list.size());
            System.out.println("Random index: " + index);
            System.out.println("Value at index: " + list.get(index));
        } else {
            System.out.println("No numbers were entered.");
        }

        scan.close();
    }
}
