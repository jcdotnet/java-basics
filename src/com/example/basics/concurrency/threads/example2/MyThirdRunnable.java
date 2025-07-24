package com.example.basics.concurrency.threads.example2;

public class MyThirdRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In MyRunnable, count is " + i);
            // stops the current working thread and give other threads with the same priority a chance
            // to execute before the current thread is scheduled again // should be used with caution
            Thread.yield();
        }
    }
}

class MyThirdRunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThirdRunnable());
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("In main thread, count is " + i);
        }

        // Output
        //In MyRunnable, count is 0
        //In main thread, count is 0 // gives up the CPU to the main thread
    }
}
