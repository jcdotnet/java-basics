package com.example.basics.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (this.age == other.age) {
            return 0;
        }
        if (this.age > other.age) {
            return 1;
        }
        return -1;  // Compare by age
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);
        Person charlie = new Person("Charlie", 35);
        Person john = new Person("John", 35);
        System.out.println("Alice is older than Bob " + alice.compareTo(bob));
        System.out.println("Bob is younger than Charlie " + bob.compareTo(charlie));
        System.out.println("John and Charlie peers " + john.compareTo(charlie));

        List<Person> people = new ArrayList<>();
        people.add(alice);
        people.add(bob);
        people.add(charlie);
        people.add(john);

        Collections.sort(people);  // Sort by natural order (age)
        System.out.println(people);


    }
}