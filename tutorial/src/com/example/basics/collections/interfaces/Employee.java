package com.example.basics.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);  // Compare by name
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 35));

        // Sort by name using NameComparator
        Collections.sort(employees, new NameComparator());
        System.out.println(employees);  // Output: [Alice: 30, Bob: 25, Charlie: 35]
    }
}
