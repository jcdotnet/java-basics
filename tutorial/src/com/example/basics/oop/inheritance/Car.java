package com.example.basics.oop.inheritance;

public class Car extends Vehicle{
    String color;
    public String model;
    private int engineNumber;

    // Constructor (used to create objects)
    public Car() {
    }
    // Constructor (used to create objects)
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method (Action)
    public void drive() {
        System.out.println("The car is driving at " + speed + " mph.");
    }

    public void startEngine() {
        System.out.println("Start engine");
    }

    public void brake() {
        System.out.println("Brake");
    }

    void setColor(String color) {
        this.color = color;
    }

    private void checkEngine() {
        System.out.println("Check engine");
    }

    protected void accelerate() {
        checkEngine();
        engineNumber = 1;
        super.accelerate();
        System.out.println(speed);
        System.out.println("Accelerate car");
    }

    @Override
    public void start() {
        System.out.println("Start Car");
    }

    public void openTrunk() {
        System.out.println("Car trunk opened");
    }
}

// Extending Car to ElectricCar (Inheritance Overuse Example)
class ElectricCar extends Car {
    public void chargeBattery() {
        System.out.println("Battery charging...");
    }

    // Electric cars don't have a traditional engine, but we still inherit startEngine()
}

// Extending Car to SportsCar (Inheritance Overuse Example)
class SportsCar extends Car {
    public void enableTurbo() {
        System.out.println("Turbo mode enabled");
    }
}

class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.startEngine();  // Irrelevant for an electric car
        tesla.chargeBattery();

        SportsCar ferrari = new SportsCar();
        ferrari.startEngine();  // Works, but is it really a distinct "Car" functionality?
        ferrari.enableTurbo();
    }
}
