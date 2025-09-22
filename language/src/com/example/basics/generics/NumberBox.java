package com.example.basics.generics;

public class NumberBox<T extends Number> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public double doubleValue() {
        return content.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setContent(123);
        System.out.println("Double value: " + intBox.doubleValue());  // Output: 123.0

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setContent(45.67);
        System.out.println("Double value: " + doubleBox.doubleValue());  // Output: 45.67
    }
}