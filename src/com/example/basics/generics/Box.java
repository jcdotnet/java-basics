package com.example.basics.generics;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        // Create a Box to hold Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer Box content: " + intBox.get());

        // Create a Box to hold String
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String Box content: " + strBox.get());
    }
}