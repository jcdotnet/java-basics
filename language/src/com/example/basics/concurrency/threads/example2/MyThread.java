package com.example.basics.concurrency.threads.example2;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread, count  " + i);
        }
    }
}

class MyThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread, count " + i);
        }
    }
}
