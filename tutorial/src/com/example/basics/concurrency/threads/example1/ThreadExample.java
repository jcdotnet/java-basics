package com.example.basics.concurrency.threads.example1;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();  // Start the thread

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}
