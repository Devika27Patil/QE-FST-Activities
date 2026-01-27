package com.example;

import java.io.FileWriter;

public class Activity14WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            fw.write("Hello Java File Handling ");
            fw.close();

            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
