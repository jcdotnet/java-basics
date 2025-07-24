package com.example.basics.core.variables;

public class LocalVariables {
    public static void main(String[] args) {
        int number = 2;
        display(number, 2);
    }

    public static void display(int param1, int param2) {
        int count = 10;
        System.out.println(count);

        int age;
        //System.out.println(age); // compilation error (not intialized)
        age = 25;
        System.out.println(age);
        int camelCase; // variables should follow camelcase conversion

        System.out.println(param1 + param2);
    }
}
