package com.example.basics.concurrency.threads.synchronization.example2;

public class MyThread extends Thread {
    private final Object monitor;

    public MyThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            System.out.println("Thread " + getId() + " before wait()");
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + getId() + " after wait()");
        }
    }
}

class MyThreadTest {
    public static void main(String[] args) {
        Object monitor = new Object();

        for (int i = 0; i < 5; i++) {
            MyThread t = new MyThread(monitor);
            t.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (monitor) {
            monitor.notify(); // if this line is updated to `monitor.notifyAll()`, then all threads will be awakened
        }
    }
}
