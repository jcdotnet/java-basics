package com.example.basics.concurrency.threads.synchronization.example2;

public class Counter {

    private final Object lock = new Object(); // monitor should be final
    private int count;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}

class LockTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // main thread will wait until thread1 dies (finishes it's task)
            thread2.join(); // main thread will wait until thread2 dies (finishes it's task)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}
