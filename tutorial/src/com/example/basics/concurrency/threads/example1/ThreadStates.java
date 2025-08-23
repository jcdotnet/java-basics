package com.example.basics.concurrency.threads.example1;

class ThreadStateExample implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(2000); // TIMED_WAITING
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " has finished execution");
    }
}

public class ThreadStates {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadStateExample(), "Thread-1");
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getName() + " is in state: " + t1.getState()); // RUNNABLE
        try {
            Thread.sleep(500); // Main thread sleeps
            System.out.println(t1.getName() + " is in state: " + t1.getState()); // TIMED_WAITING
            t1.join(); // Main thread waits for t1
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(t1.getName() + " is in state: " + t1.getState());

    }
}