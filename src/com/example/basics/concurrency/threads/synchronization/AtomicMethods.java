package com.example.basics.concurrency.threads.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMethods {

    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(10);
        System.out.println("Initial Value: " + atomicInt.get());

        atomicInt.set(20);
        System.out.println("Updated Value: " + atomicInt.get());
        System.out.println("Incremented Value: " + atomicInt.incrementAndGet());
        System.out.println("Value after getAndIncrement: " + atomicInt.getAndIncrement());
        System.out.println("Current Value: " + atomicInt.get());

        System.out.println("Decremented Value: " + atomicInt.decrementAndGet());
        System.out.println("Decremented Value: " + atomicInt.getAndDecrement());
        System.out.println("Updated Decremented Value: " + atomicInt.get());

        System.out.println("Value after addAndGet(50): " + atomicInt.addAndGet(50));
        System.out.println("Value after getAndAdd(20): " + atomicInt.getAndAdd(20));
        System.out.println("Current Value: " + atomicInt.get());
    }
}