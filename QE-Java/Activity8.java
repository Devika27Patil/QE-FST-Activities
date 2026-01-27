package com.example;

public class Activity8 {
    static void exceptionTest(String text) throws CustomException {
        if (text == null){
            throw new CustomException("String value is null");
        } else {
            System.out.println(text);
        }
    }

    public static void main (String[] args) {
        try {
            exceptionTest("Will print console");
            exceptionTest(null);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}

