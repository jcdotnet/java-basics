package com.example.basics.concurrency.threads.interruption;

public class MySecondThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}

class MySecondThreadTest {
    public static void main(String[] args) {
        MySecondThread thread = new MySecondThread();
        thread.start();
        thread.interrupt(); // throws InterruptedException
    }
}
