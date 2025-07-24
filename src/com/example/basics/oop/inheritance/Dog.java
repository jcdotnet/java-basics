package com.example.basics.oop.inheritance;

public class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sound();
        dog.name = "Charlie";
        System.out.println(dog.name);

        Cat cat = new Cat();
        cat.eat();
        cat.sound();
        cat.name = "Daisy";
        System.out.println(cat.name);

    }
}
