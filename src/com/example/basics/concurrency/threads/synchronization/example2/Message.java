package com.example.basics.concurrency.threads.synchronization.example2;

public class Message {
    private String message;

    public synchronized String getMessage() {
        while (message == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String msg = message;
        message = null;
        notifyAll();
        return msg;
    }

    public synchronized void setMessage(String message) {
        while (this.message != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        notifyAll();
    }
}

class WaitNotifyAllExample {
    public static void main(String[] args) {
        // Create a shared Message object
        Message message = new Message();

        // Create a producer thread
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] messages = {"Hello", "World", "in", "Java"};

                for (String msg : messages) {
                    try {
                        Thread.sleep(1000); // Simulate some delay in message production
                        message.setMessage(msg);
                        System.out.println("Produced: " + msg);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                // Signal completion
                message.setMessage("DONE");
            }
        });

        // Create a consumer thread
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (String msg = message.getMessage(); !msg.equals("DONE"); msg = message.getMessage()) {
                    System.out.println("Consumed: " + msg);
                }
            }
        });

        // Start both threads
        producer.start();
        consumer.start();

        // Wait for both threads to finish
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
