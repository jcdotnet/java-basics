package com.example.basics.concurrency.threads.synchronization.example1;

class SharedResource {
    // when a thread enters a synchronized block/method, it acquires a lock on the shared object
    // other threads must wait until the thread releases the acquired monitor lock
    public synchronized void display(String message) {
        System.out.println("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class MyThread extends Thread {
    SharedResource resource;
    String message;

    MyThread(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    public void run() {
        resource.display(message);
    }
}

public class MonitorExample {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new MyThread(resource, "Thread1");
        Thread t2 = new MyThread(resource, "Thread2");

        t1.start();
        t2.start();
    }
}
