package com.example.basics.core.conditionals;

public class IfElseStatement {
    public static void main(String[] args) {

        int number = -10;

        int count = 0;
        if (number == -10) {
            count++;
            System.out.println("number is -10");
        }


        System.out.println(count);
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even");
            } else {
                System.out.println("The number is positive and odd");
            }
        } else if (number == -10) {
            System.out.println("Number is -10");
        } else if (number <= 10) {
            System.out.println("Number is less than or equal to -10");
        } else {
            System.out.println("The number is negative");
        }
    }
}
