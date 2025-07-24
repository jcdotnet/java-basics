package com.example.basics.concurrency.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor { // the most commonly used implementation of ExecutorService
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing task " + taskNumber + " by thread " + Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
    }
}
