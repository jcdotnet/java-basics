package com.example.basics.concurrency.threads.example2;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunnable, count " + i);
        }
    }
}

class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread, count " + i);
        }
    }
}
