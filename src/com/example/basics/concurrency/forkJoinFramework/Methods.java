package com.example.basics.concurrency.forkJoinFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Methods {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = {1, 2, 3, 4};

        // create a ForkJoinPool
        ForkJoinPool fjPool = new ForkJoinPool();

        // getParallelism
        // returns the parallelism level of the tool,
        // i.e. the number of worker threads that are actively executing tasks
        int parallelism = fjPool.getParallelism();
        System.out.println("parallelism = " + parallelism);

        // invoke
        // submits a task to the pool, which then starts running on a separate thread,
        // block the calling thread until the task complete and return the result of the task
        SumTask task1 = new SumTask(array, 0, array.length);
        System.out.println("before invoke");
        int result1 = fjPool.invoke(task1);
        System.out.println("after invoke");
        System.out.println("invoke result = " + result1);

        // execute
        // submits a task to the pool, does not block anything and does not return anything
        SumTask task2 = new SumTask(array, 0, array.length);
        System.out.println("before execute");
        fjPool.execute(task2);
        System.out.println("after execute");

        // submit
        // submits a task to the pool and return a future object that can be used to
        // retrieve the result of the task later
        SumTask task3 = new SumTask(array, 0, array.length);
        System.out.println("before submit");
        Future<Integer> result2 = fjPool.submit(task3);
        System.out.println("after submit");
        System.out.println("submit result = " + result2.get());

        // shutdown
        // shuts down the pool and stops all workers threads
        // does not wait for tasks to complete
        fjPool.shutdown();

        // await termination
        // waits for all task to complete before shutting down the pool
        fjPool.awaitTermination(1, TimeUnit.MINUTES);
    }
}
