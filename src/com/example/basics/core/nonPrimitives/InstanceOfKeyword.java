package com.example.basics.core.nonPrimitives;

public class InstanceOfKeyword {

    public static void main(String[] args) {
        String text = "Some string";
        Integer number = 10;

        System.out.println(text instanceof String);
        System.out.println(number instanceof Integer);

        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal animal1 = new Dog();

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(animal1 instanceof Dog);

        if (animal1 instanceof Dog) {
            Dog dog1 = (Dog) animal1;
        }

        A a = new B();

        System.out.println(a instanceof A) ;

        A nullReference = null;

        System.out.println(nullReference instanceof A);
        System.out.println(a instanceof Object);
    }

}

class Animal {

}
class Dog extends Animal {

}

interface A {

}
class B implements A {

}
