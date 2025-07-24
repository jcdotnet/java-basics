package com.example.basics.features;

public class RecordJava16 {

    record Person(String name, int age) {}

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person);  // Output: Person[name=Alice, age=30]
        System.out.println(person.name());  // Output: Alice
        System.out.println(person.age());
    }
}
