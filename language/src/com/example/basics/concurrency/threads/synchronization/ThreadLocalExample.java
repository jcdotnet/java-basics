package com.example.basics.concurrency.threads.synchronization;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Integer> myThreadLocal = new ThreadLocal<>();
        myThreadLocal.set(42);
        System.out.println("The value for this thread is " + myThreadLocal.get());

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Hello world!");

        String value = threadLocal.get();
        System.out.println(value); // Output: Hello world!
        threadLocal.remove();
    }
}
