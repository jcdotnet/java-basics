package com.example.basics.concurrency.threads.example2;

public class ThreadStates implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running");
    }
}

class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadStates());

        System.out.println("Thread state: " + t.getState()); // NEW

        t.start();

        System.out.println("Thread state: " + t.getState()); // RUNNABLE

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state: " + t.getState()); // TERMINATED
    }

}
