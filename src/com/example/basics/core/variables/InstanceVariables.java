package com.example.basics.core.variables;

public class InstanceVariables {

    String model = "test"; // instance variable
    static int speed = 1; // static variable

    public static void main(String[] args) {
        System.out.println(new InstanceVariables().model);
        System.out.println(speed);
    }

}
