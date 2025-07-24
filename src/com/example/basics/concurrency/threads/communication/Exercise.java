package com.example.basics.concurrency.threads.communication;
class SharedResource {
    private int data;
    private boolean empty;

    public SharedResource() {
        empty = true;
    }

    public synchronized  int get() {
        /*
            TODO:
            - The get() method should retrieve the value (data) from the shared resource
            - If the resource is empty, the method should wait until a value is available
            - Once a value is retrieved, it should:
                - set 'empty' to 'true'
                - notify any waiting threads that the resource is now empty
        */
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return data;

    }

    public synchronized void put(int data) {
        /*
            TODO:
            - The put() method should write a value (data) to the shared resource
            - If the resource is not empty, the method should wait until the resource is available
            - Once a value is retrieved, it should:
                - set 'empty' to 'false'
                - notify any waiting threads that the resource now contains data
        */
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.data = data;
        notifyAll();
    }
}

class Writer implements Runnable {

    private SharedResource resource;

    public Writer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.put(i);
            System.out.println("Written: " + i);
        }
    }
}

class Reader implements Runnable {

    private SharedResource resource;

    public Reader(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = resource.get();
            System.out.println("Read: " + data);
        }
    }
}

public class Exercise {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread writerThread = new Thread(new Writer(resource));
        Thread readerThread = new Thread(new Reader(resource));

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
