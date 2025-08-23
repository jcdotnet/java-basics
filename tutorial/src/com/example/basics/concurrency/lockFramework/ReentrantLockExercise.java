package com.example.basics.concurrency.lockFramework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {

    private int value;
    private Lock lock;

    public SharedResource() {
        this.value = 0;
        this.lock = new ReentrantLock();
    }

    public void increment() {
        /*
            TODO:
            - Use the ReentrantLock to ensure that the value is incremented safely
            - Use the lock() method to acquire the lock before incrementing the value.
            - Ensure that the unlock() method is called to guarantee that the lock is always released.
        */
        lock.lock(); //
        value++;
        lock.unlock(); //
    }

    public int getValue() {
        return value;
    }
}

public class ReentrantLockExercise {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
