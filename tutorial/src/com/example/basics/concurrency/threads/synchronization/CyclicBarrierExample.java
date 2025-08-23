package com.example.basics.concurrency.threads.synchronization;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {
        int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, () ->
                System.out.println("All threads reached the barrier. Proceeding..."));

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(new Task(barrier)).start();
        }
    }
}
class Task implements Runnable {

    private final CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is doing some work.");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " reached the barrier.");
            barrier.await(); // Waiting for others
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}