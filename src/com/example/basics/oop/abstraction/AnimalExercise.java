package com.example.basics.oop.abstraction;

interface IAnimal {

    void sound();
}

abstract class Mammal {

    abstract void habitat();

    void description() {
        System.out.println("I am a mammal");
    }
}

// TODO: This class should extend the Mammal abstract class and implement the Animal interface
class DogAnimal extends Mammal implements IAnimal {

    // TODO: Implement the methods
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    void habitat() {
        System.out.println("Domestic");
    }
}

public class AnimalExercise {
}
