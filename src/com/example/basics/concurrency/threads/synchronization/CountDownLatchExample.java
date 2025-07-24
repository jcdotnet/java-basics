package com.example.basics.concurrency.threads.synchronization;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        int numberOfTasks = 3;
        CountDownLatch latch = new CountDownLatch(numberOfTasks);
        for (int i = 0; i < numberOfTasks; i++) {
            new Thread(new CountdownLatchTask(latch)).start();
        }
        try {
            System.out.println("Main thread waiting for tasks to finish...");
            latch.await(); // Wait until the count reaches zero
            System.out.println("All tasks are done. Main thread proceeding...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CountdownLatchTask implements Runnable {

    private final CountDownLatch latch;

    public CountdownLatchTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is performing its task.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " completed its task.");
        latch.countDown(); // Decrement the latch count
    }
}