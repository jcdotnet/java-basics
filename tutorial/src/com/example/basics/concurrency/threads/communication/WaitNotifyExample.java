package com.example.basics.concurrency.threads.communication;

class OddNumberPrinter implements Runnable {

    private final Object lock; // monitor object

    public OddNumberPrinter(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i < 10; i += 2) {
                try {
                    lock.wait(); // Wait for the other thread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                lock.notify(); // Notify the other thread
            }
            lock.notify(); // Notify the other thread to exit
        }
    }
}

class EvenNumberPrinter implements Runnable {

    private final Object lock; // monitor object

    public EvenNumberPrinter(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i);
                lock.notify(); // Notify the other thread
                try {
                    lock.wait(); // Wait for the other thread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notify(); // Notify the other thread to exit
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a shared lock object
        Object lock = new Object();

        // Create the even and odd number printer threads
        Thread oddNumberPrinterThread = new Thread(new OddNumberPrinter(lock));
        Thread evenNumberPrinterThread = new Thread(new EvenNumberPrinter(lock));

        // Start the threads
        oddNumberPrinterThread.start();
        evenNumberPrinterThread.start();
    }
}
