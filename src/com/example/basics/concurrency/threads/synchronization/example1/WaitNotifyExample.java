package com.example.basics.concurrency.threads.synchronization.example1;

class SharedResourceExample {

    private int data = 0;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // Wait if there's already data
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify(); // Notify the waiting consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait(); // Wait until data is produced
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // Notify the producer to produce more
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResourceExample resource = new SharedResourceExample();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}