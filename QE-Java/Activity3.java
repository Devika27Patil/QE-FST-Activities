// package com.example;

// public class Activity3 {

//     public static void main(String[] args) {

//         double seconds = 1_000_000_000;

//         double earthYearSeconds = 31557600;

//         double earthYears = seconds / earthYearSeconds;

//         System.out.println("Age on Earth: " + earthYears);

//         System.out.println("Age on Mercury: " + (earthYears / 0.2408467));
//         System.out.println("Age on Venus: " + (earthYears / 0.61519726));
//         System.out.println("Age on Mars: " + (earthYears / 1.8808158));
//         System.out.println("Age on Jupiter: " + (earthYears / 11.862615));
//         System.out.println("Age on Saturn: " + (earthYears / 29.447498));
//         System.out.println("Age on Uranus: " + (earthYears / 84.016846));
//         System.out.println("Age on Neptune: " + (earthYears / 164.79132));
//     }
// }







package com.example;

public class Activity3 {

    public static void main(String[] args) {

        double seconds = 1000000000;

        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        double earthYears = seconds / earthSeconds;

        System.out.println("Age on Earth: " + earthYears);
        System.out.println("Age on Mercury: " + (earthYears / mercurySeconds));
        System.out.println("Age on Venus: " + (earthYears / venusSeconds));
        System.out.println("Age on Mars: " + (earthYears / marsSeconds));
        System.out.println("Age on Jupiter: " + (earthYears / jupiterSeconds));
        System.out.println("Age on Saturn: " + (earthYears / saturnSeconds));
        System.out.println("Age on Uranus: " + (earthYears / uranusSeconds));
        System.out.println("Age on Neptune: " + (earthYears / neptuneSeconds));
    }
}

