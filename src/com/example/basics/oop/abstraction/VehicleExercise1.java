package com.example.basics.oop.abstraction;

interface IVehicle { // renamed to IVehicle to avoid duplicated classes

    // TODO: Define start method
    void start();

    // TODO: Define stop method
    void stop();

    // TODO: Define default honk method that prints "Honking..."
    default void honk() {
        System.out.println("Honking...");
    }

    // TODO: Define static displayType method that prints "Vehicle Type"
    static void displayType() {
        System.out.println("Vehicle Type");
    }
}

// TODO: this interface should extend the Vehicle interface
interface ElectricVehicle extends IVehicle {

    // TODO: Define charge method
    void charge();
}

// TODO: this class should implement the ElectricVehicle interface
class ElectricCar implements ElectricVehicle {

    // TODO: Implement start method
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    // TODO: Implement stop method
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    // TODO: Implement charge method
    @Override
    public void charge() {
        System.out.println("Car is charging");
    }
}
public class VehicleExercise1 {
    // IVehicle car = new ElectricCar();
    // ElectricVehicle car = new ElectricCar();
    ElectricCar car = new ElectricCar();
}
