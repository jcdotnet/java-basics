package com.example.basics.concurrency.lockFramework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionsExample {


    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int count = 0;

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void waitForCount(int target) throws InterruptedException {
        lock.lock();
        try {
            while (count < target) {
                System.out.println(Thread.currentThread().getName() + " is waiting for count to reach " + target);
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " detected count has reached " + target);
        } finally {
            lock.unlock();
        }
    }
}

class LockConditionsMain {
    public static void main(String[] args) {
        LockConditionsExample example = new LockConditionsExample();
        int target = 5;

        // Create a thread to wait for the count to reach the target value
        Thread waiter = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    example.waitForCount(target);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Waiter");

        // Create threads to increment the count
        Thread incrementer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        example.increment();
                        Thread.sleep(100); // Sleep to simulate some work
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Incrementer1");

        Thread incrementer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        example.increment();
                        Thread.sleep(100); // Sleep to simulate some work
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Incrementer2");

        // Start the threads
        waiter.start();
        incrementer1.start();
        incrementer2.start();
    }
}
