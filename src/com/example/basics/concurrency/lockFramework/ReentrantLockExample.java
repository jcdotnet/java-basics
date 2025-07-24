package com.example.basics.concurrency.lockFramework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();

    public void doSmth() {
        lock.lock();
        System.out.println("Locked for thread " + Thread.currentThread().getName());
        try {
            // critical section of code
            System.out.println("Within lock for thread " + Thread.currentThread().getName());
        } finally {
            System.out.println("Unlocking for thread " + Thread.currentThread().getName());
            lock.unlock();
        }
    }
}

class ReentrantLockMain{
    public static void main(String[] args) {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.doSmth();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.doSmth();
            }
        });
        thread1.start();
        thread2.start();
    }
}
