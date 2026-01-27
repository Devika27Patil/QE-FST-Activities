package com.example;

// Abstract class
abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

// Child class
class MyBook extends Book {

    void setTitle(String s) {
        title = s;
    }
}

public class abstractionActivity {
    public static void main(String[] args) {

        MyBook newNovel = new MyBook();

        String title = "Java Programming";

        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}

