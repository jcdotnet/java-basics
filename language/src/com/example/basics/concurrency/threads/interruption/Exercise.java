package com.example.basics.concurrency.threads.interruption;

// TODO: MyThread should extend Thread
class MyThread extends Thread {

    @Override
    public void run() {
        // TODO: Implement a loop that continues until the thread is interrupted. You can check if the thread is interrupted by using the isInterrupted() method.
        while (!isInterrupted()) {
            // Within the loop:
            // TODO: print "Thread is running" to the console
            // TODO: Use Thread.sleep(500) to pause the thread for 500 milliseconds to simulate work, wrap it with try-catch block to handle the InterruptedException. If the exception is caught, print a message "Thread was interrupted during sleep" to the console and break out of the loop.
            System.out.println("Thread is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep");
                break;
            }
        }
        // After the loop is exited:
        // TODO: the following message should be printed to the console: "Thread is exiting"
        System.out.println("Thread is exiting");
    }
}

public class Exercise {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        // TODO: start the thread
        thread.start();

        // Sleep for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO: interrupt the thread
        thread.interrupt();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


