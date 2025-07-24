package com.example.basics.concurrency.threads.example1;

public class ThreadMainMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();

        thread.start(); //Starts the thread; calls the run() method.
        thread.run(); //Contains the code to be executed by the thread.
        thread.join();// Waits for a thread to finish execution.
        thread.sleep(1000); //Pauses the thread for a specified time in milliseconds.
        thread.yield(); //Temporarily pauses the current thread to let others run.
        thread.getName(); //Gets the thread 's name.
        thread.setName("name"); //Sets the thread 's name.
        thread.isAlive(); //Checks if the thread is still running.
        thread.interrupt(); //Interrupts a thread in sleep or waiting state.
        thread.setPriority(1); //Sets the thread 's priority (1 to 10).
        thread.getPriority(); //Gets the thread 's priority.


    }
}
