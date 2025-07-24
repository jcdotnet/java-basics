package com.example.basics.core.conditionals;

public class SwitchStatement {

    public static void main(String[] args) {

        withSwitch();

        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("You chose Apple.");

            case "Banana":
                System.out.println("You chose Banana.");

            default:
                System.out.println("Fruit not available.");
        }
//
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            default:
                System.out.println("Better luck next time.");
        }
//
        Day currentDay = Day.WEDNESDAY;
        switch (currentDay) {
            case MONDAY:
                System.out.println("Start of the workweek.");
                break;
            case TUESDAY:
                System.out.println("Second day of the workweek.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day.");
                break;
            default:
                System.out.println("Unknown day.");
        }
//
        double a = 0.1 + 0.2;
        System.out.println(a);
//
        nullPointerInSwitch(null);
    }

    private static void withIfElse() {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Invalid day");
        }
    }

    private static void withSwitch() {
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 6,7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void nullPointerInSwitch(String a) {
        switch(a) {
            case "A":
                System.out.println("A");
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}
