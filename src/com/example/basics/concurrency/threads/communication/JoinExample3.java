package com.example.basics.concurrency.threads.communication;

class MyJoinThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinExample3 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyJoinThread();
        Thread thread2 = new MyJoinThread();

        thread1.start();
        thread1.join(); // Main thread waits for thread1 to complete

        thread2.start();
        thread2.join();
        System.out.println("Main method running");
    }
}