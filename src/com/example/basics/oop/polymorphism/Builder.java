package com.example.basics.oop.polymorphism;

import com.example.basics.oop.inheritance.Animal;
import com.example.basics.oop.inheritance.Cat;
import com.example.basics.oop.inheritance.Dog;

public class Builder {
    Animal build() {
        return new Animal();
    }
}
class CatBuilder extends Builder {
    @Override
    Cat build() {
        return new Cat();
    }
}

class DogBuilder extends Builder {
    @Override
    Dog build() {
        return new Dog();
    }
}