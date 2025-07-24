package com.example.basics.oop.abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

// Concrete subclass Dog extends abstract class Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Concrete subclass Cat extends abstract class Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class Output {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Cannot instantiate an abstract class

        // Instantiate concrete classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call abstract method (implemented in the subclasses)
        dog.makeSound();  // Output: The dog barks.
        cat.makeSound();  // Output: The cat meows.

        // Call concrete method from the abstract class
        dog.eat();  // Output: This animal is eating.
        cat.eat();  // Output: This animal is eating.
    }
}