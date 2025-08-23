package com.example.basics.oop.encapsulation;

public class Car {
    // Private attribute (hidden data)
    private int speed;

    // Public method to set speed (controls access)
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    // Public method to get the current speed (controlled access)
    public int getSpeed() {
        return this.speed;
    }
}
class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // car.speed = 100;
        car.setSpeed(100);
        System.out.println(car.getSpeed());
    }
}