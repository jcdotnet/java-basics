package com.example.basics.concurrency.forkJoinFramework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.util.concurrent.ForkJoinWorkerThread;

// dummy class for learning purposes
class CustomThreadFactory implements ForkJoinWorkerThreadFactory {

    @Override
    public ForkJoinWorkerThread newThread(ForkJoinPool pool) {
        // TODO: implement
        return null;
    }
}

public class Constructors {
    // Default Constructor
    ForkJoinPool fjPool = new ForkJoinPool();

    // Constructor with parallelism level
    int parallelismLevel = 5;
    ForkJoinPool fjPool2 = new ForkJoinPool(parallelismLevel);

    // Constructor with ForkJoinWorkerThreadFactory
    ForkJoinWorkerThreadFactory threadFactory = new CustomThreadFactory();
    ForkJoinPool fjPool3 = new ForkJoinPool(parallelismLevel, threadFactory, null, true);
}
