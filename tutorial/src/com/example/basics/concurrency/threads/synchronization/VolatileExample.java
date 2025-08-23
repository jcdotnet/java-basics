package com.example.basics.concurrency.threads.synchronization;

public class VolatileExample {

    // volatile keyword: the var value may be modified by multiple threads
    // and therefore should not be cached by any thread, it ensures that
    // a variable is accessed and modified safely by multiple threads.
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread started...");
            while (running) {
                System.out.println("Thread is running");
            }
            System.out.println("Thread stopped.");
        });

        thread.start();

        Thread.sleep(1000); // Allow thread to start and run
        running = false;    // Main thread updates the variable
        System.out.println("Main thread updated running to false.");
    }

}