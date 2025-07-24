package com.example.basics.concurrency.threads.groups;

class MyExceptionHandler implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Caught Exception: " + e.getMessage());
    }
}

class MyThread implements Runnable {

    public void run() {
        // Do some work
        throw new RuntimeException("Oops, something went wrong");
    }
}
public class ThreadGroupExample3 {

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread());
        myThread.setUncaughtExceptionHandler(new MyExceptionHandler());
        myThread.start();
    }
}
