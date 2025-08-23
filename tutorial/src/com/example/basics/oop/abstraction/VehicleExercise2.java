package com.example.basics.oop.abstraction;

// TODO: make the class abstract
abstract class Vehicle {

    // TODO: Define properties 'model' (String), 'year' (int), and 'type' (String) with the default access modifier
    String model;
    int year;
    String type;

    // TODO: Define a constructor that initializes the properties
    public Vehicle(String model, int year, String type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    // TODO: Declare an abstract void method startEngine()
    public abstract void startEngine();

}

// TODO: Car class should extend Vehicle class
class Car extends Vehicle{

    // TODO: Define a constructor that calls super to initialize the properties (pass "Car" as type to the super constructor)
    public Car(String model, int year) {
        super(model, year, "Car");
    }

    // TODO: Implement the startEngine method
    @Override
    public void startEngine() {
        System.out.println("The car engine is starting");
    }
}

public class VehicleExercise2 {
    public static void main(String[] args) {
        Vehicle car = new Car("Seat", 2002);
        car.startEngine();
    }
}
