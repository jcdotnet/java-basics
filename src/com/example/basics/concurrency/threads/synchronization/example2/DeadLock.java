package com.example.basics.concurrency.threads.synchronization.example2;

class Resource {
    public synchronized void doSomething() {
        System.out.println("Resource does something");
    }
}

class Worker extends Thread {

    private final Resource resource1;
    private final Resource resource2;

    public Worker(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    public void run() {
        synchronized (resource1) {
            System.out.println("Worker acquired lock on resource1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println("Worker acquired lock on resource2");
                // Do something with resource1 and resource2
            }
        }
    }
}
public class DeadLock {

    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Worker worker1 = new Worker(resource1, resource2);
        Worker worker2 = new Worker(resource2, resource1);

        worker1.start();
        worker2.start();
    }
}

