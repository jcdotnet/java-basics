package com.example.basics.concurrency.threads.example2;

public class MySecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running (before sleep)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " running (after sleep)");
    }
}

class MySecondThreadTest {
    public static void main(String[] args) {
        MySecondThread myThread = new MySecondThread();
        myThread.start();
    }
}
