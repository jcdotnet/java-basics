package com.example.basics.oop.inheritance;

public class Truck extends Vehicle{
    private int cargoCapacity;

    @Override
    protected void accelerate() {
        System.out.println(speed);
        super.accelerate();
    }
}
