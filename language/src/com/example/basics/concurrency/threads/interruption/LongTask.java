package com.example.basics.concurrency.threads.interruption;

public class LongTask implements Runnable {
    private volatile boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
            // perform long-running task
            try {
                // block on I/O
                System.out.println("Sleeping for 1 second");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        System.out.println("Stopping");
        stop = true;
    }
}

class LongTaskTest {
    public static void main(String[] args) {
        LongTask task = new LongTask();
        Thread taskThread = new Thread(task);
        taskThread.start();

        // wait a bit
        try {
            System.out.println("Sleeping for 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // stop the task thread
        task.stop();
    }
}