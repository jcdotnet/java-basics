package com.example.basics.concurrency.threads.example2;

public class MySecondRunnable implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Started " + threadName);
        for (int i = 0; i < 5; i++) {
            System.out.println("In " + threadName + ", count is " + i);
        }
    }
}

class MySecondRunnableMain {
    public static void main(String[] args) {
        Thread t0 = new Thread(new MySecondRunnable());
        Thread t1 = new Thread(new MySecondRunnable());
        t0.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();
    }
}