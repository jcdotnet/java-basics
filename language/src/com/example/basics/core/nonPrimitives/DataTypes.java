package com.example.basics.core.nonPrimitives;

import java.util.ArrayList;
import java.util.List;

public class DataTypes {

    Person person;

    public static void main(String[] args) {
        // Person person = new Person("some name", 30); // instance of the class Person
        // System.out.println("Name: " + person.name);
        // System.out.println("Age: " + person.age);
        // person.display();
        Days day = Days.MONDAY;
        System.out.println(new DataTypes().person);
        String str = "Hello World";
        int[] numbers = {1,2,3,4,5};

        List<String> list = new ArrayList<>();
        list.add("Java");
    }
}

class Person {
    // attributes / properties
    String name; // instance attribute
    int age; // instance attribute
    static int staticValue; // class or static attribute
    int value; // instance attribute

    // static blocks are executed when the class is loaded in memory
    // used to initialize static variables or perform any one-time setup operation
    static {
        staticValue = 1;
        System.out.println("Static block: " + staticValue);
    }

    // dynamic blocks are executed every time an object is instantiated
    // used to initialize instance variables or perform instance operations
    {
        value = 2;
        System.out.println("Dynamic block: " + value);
    }
    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // methods
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface Vehicle {
    int MAX_SPEED = 120;

    void start();

    default void display() {
        System.out.println("This is vehicle");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {

    }
}
enum Days {MONDAY, TUESDAY, WEDNESDAY}
