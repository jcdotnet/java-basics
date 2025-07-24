package com.example.basics.collections.equals;

import java.util.Objects;

public class Person {

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Override equals() to compare Person objects by 'id'
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id; //&& Objects.equals(name, person.name);
    }

    // Override hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 101);
        Person p2 = new Person("Bob", 101);
        Person p3 = new Person("Kate", 101);
        Person p4 = new Person("Alice", 101);

        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

    }
}
