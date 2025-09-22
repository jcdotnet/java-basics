package com.example.basics.oop.polymorphism;

final class Car extends Vehicle {
    private static final String TEST = "123";

//   public Car() {
//        TEST= "4321";
//    }
//
//    public void start() {
//    }
}

//class SportsCar extends Car {
//}

class Vehicle {
    public final void start() {
        System.out.println("Vehicle started");
    }
}
