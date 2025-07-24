package com.example.basics.oop.inheritance;

public class Vehicle {
    protected int speed;

    protected void accelerate() {
        System.out.println("Accelerate vehicle");
    }

    public void start() {
        System.out.println("Start vehicle");
    }
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }

}
