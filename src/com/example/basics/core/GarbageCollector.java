package com.example.basics.core;

public class GarbageCollector {
    int primitiveVar = 10;   // Stored in the heap as part of the object
    String objectVar = "Hello";  // objectVar reference is in the heap, "Hello" object in heap

    public static void main(String[] args) {
        int localVar = 5;   // Local variable (primitive) stored in stack
        GarbageCollector ex = new GarbageCollector(); // Reference is in the stack, actual object is in heap
    }
}
