package com.example.basics.concurrency.threads.synchronization.example2;

class CounterExample {
    private int count;

    public int getCount() {
        return count;
    }

    // public void increment() // race conditions
    // synchronized: called only by one thread at a time
    public synchronized void increment() {
        count++;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        CounterExample counter = new CounterExample();

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
