package com.example.basics.oop.test;

import com.example.basics.oop.inheritance.Car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("", 100);
        car.model = "Some model";
        car.startEngine();
        // car.color = "Red";
    }
}
