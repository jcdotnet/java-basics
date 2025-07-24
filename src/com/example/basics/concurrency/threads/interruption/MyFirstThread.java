package com.example.basics.concurrency.threads.interruption;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Doing some work");
        }
    }
}

class InterruptExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        // interrupt the thread after some time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
