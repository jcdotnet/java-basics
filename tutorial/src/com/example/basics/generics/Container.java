package com.example.basics.generics;

public interface Container<T> {
    void set(T value);
    T get();
}
// Class implementing the generic interface
class StringContainer implements Container<String> {
    private String value;

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }

    public static void main(String[] args) {
        Container<String> container = new StringContainer();
        container.set("Hello World");
        System.out.println("Container content: " + container.get());  // Output: Hello World
    }
}