package com.example.basics.oop.constructor;

public class Example {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    public Example() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        Example example1 = new Example();

        Example example2 = new Example();
    }
}