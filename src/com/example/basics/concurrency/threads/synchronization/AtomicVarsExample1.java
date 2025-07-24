package com.example.basics.concurrency.threads.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class MyFirstCounter {

    private AtomicInteger count = new AtomicInteger(0);
    //int i = 0;
    public void increment() {
        count.incrementAndGet();
        //  i++; // not sync
    }

    public int getCount() {
        return count.get();
        // return i; // not sync
    }
}
public class AtomicVarsExample1 {
    public static void main(String[] args) {
        MyFirstCounter counter = new MyFirstCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}