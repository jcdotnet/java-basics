package com.example.basics.concurrency.threads.synchronization;

class RequestProcessor {

    // ThreadLocal variable to hold data specific to each thread
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return "Initial Request Data";
        }
    };

    public void processRequest(String request) {
        // Get the data for the current thread
        String context = threadLocal.get();

        // Process the request using the thread-specific data
        System.out.println("Processing request: " + request + " with context: " + context);

        // Optionally modify the thread-local data
        threadLocal.set("Processed Request Data");
    }
}

public class ThreadLocalExample2 {
    public static void main(String[] args) {
        RequestProcessor processor = new RequestProcessor();

        // Create and start threads to process requests
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.processRequest("Request 1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                processor.processRequest("Request 2");
            }
        });

        thread1.start();
        thread2.start();
    }
}
