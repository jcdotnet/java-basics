package com.example.basics.concurrency.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// TODO: Implement the Callable<Integer> interface
class SumCallable implements Callable<Integer> {

    private int n;

    // TODO: The class should have a constructor that takes an integer n
    SumCallable(int n) {
        this.n = n;
    }
    // TODO: Override the 'call' method to calculate and return the sum of integers from 1 to n
    @Override
    public Integer call() {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum+= i+1;
        }
        return sum;
    }
}


public class CallableExercise {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // TODO: Create an ExecutorService using Executors.newSingleThreadExecutor()
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // TODO: Create an instance of SumCallable with the parsed integer 'n'.
        SumCallable sumTask = new SumCallable(n);
        Future<Integer> result =  executorService.submit(sumTask); // TODO: Submit the SumCallable task to the ExecutorService

        try {
            Integer sum = result.get(); // TODO: Retrieve the result from the Future object
                    System.out.println("Sum: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // TODO: Shut down the ExecutorService
            executorService.shutdown();
        }
    }
}
