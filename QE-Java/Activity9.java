package com.example;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Devika");
        myList.add("Ritesh");
        myList.add("Devu");
        myList.add("Ritika");
        myList.add("Guru");

        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("\n3rd name: " + myList.get(2));

        System.out.println("\nContains Ritesh? " + myList.contains("Ritesh"));

        System.out.println("\nSize of list: " + myList.size());

        myList.remove("Devu");

        System.out.println("Size after removal: " + myList.size());
    }
}
