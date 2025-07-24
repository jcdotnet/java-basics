package com.example.basics.concurrency.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LongTask implements Callable<String> {
    public String call() throws Exception {
        // Long computation here
        return "Result of long task";
    }
}

class LongTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // submit() returns a Future object that we can use to retrieve the result of the computation later
        Future<String> futureResult = executor.submit(new LongTask());

        // get() blocks the current thread untile the task is complete and the result is available
        String result = futureResult.get();
        System.out.println(result);

        executor.shutdown();
    }
}


