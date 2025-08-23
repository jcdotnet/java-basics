package com.example.basics.oop.constructor;

class Vehicle {

    private String color;

    public Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    public Vehicle(String color) {
        this.color = color;
        System.out.println("Color is " + color);
    }
}

class Car extends Vehicle {
    String model;
    int year;
    static String type;

    // Static block
    static {
        type = "Sedan";
        System.out.println("Static Block: Car type is initialized.");
    }

    {
        System.out.println("Instance Initialization Block: Executed before constructor.");
    }

    public Car() {
        super();
        System.out.println("Car Constructor");
    }

    // Constructor
    public Car(String model) {
        super("Red");
        this.model = model;
        System.out.println("Car model is: " + model);
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Constructor 2: Car model is " + model + " and year is " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");  // Output: Car model is: Toyota
    }
}