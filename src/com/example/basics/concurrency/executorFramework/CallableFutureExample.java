package com.example.basics.concurrency.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {

    public static void main(String[] args) {
        // Create a thread pool
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Define a Callable task
        Callable<String> callableTask = () -> {
            Thread.sleep(2000); // Simulate a delay
            return "Task completed!";
        };

        // Submit the Callable task to the executor
        Future<String> future = executor.submit(callableTask);

        // Perform other operations while the task executes
        System.out.println("Task is submitted. Doing other work...");

        try {
            // Check if the task is completed
            if (!future.isDone()) {
                System.out.println("Task is still in progress...");
            }

            // Retrieve the result of the Callable task
            String result = future.get();
            System.out.println("Result from Callable: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor
            executor.shutdown();
        }
    }
}