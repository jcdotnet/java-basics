package com.example.basics.oop.polymorphism;

class Animal {
    // Superclass method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference, Animal object
        Animal myDog = new Dog();        // Animal reference, Dog object
        Animal myCat = new Cat();        // Animal reference, Cat object

        myAnimal.sound();  // Outputs: Animal makes a sound
        myDog.sound();     // Outputs: Dog barks
        myCat.sound();     // Outputs: Cat meows
    }
}
