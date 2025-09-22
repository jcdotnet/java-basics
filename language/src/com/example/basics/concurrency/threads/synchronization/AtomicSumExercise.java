package com.example.basics.concurrency.threads.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicSum {

    // TODO: define the AtomicInteger 'sum'
    private AtomicInteger sum = new AtomicInteger(0);

    public void add(int value) {
        // TODO: Implement an 'add' method that adds a value to the sum atomically using the addAndGet method of AtomicInteger.
        sum.addAndGet(value);
    }

    public int getSum() {
        // TODO: Implement a 'getSum' method that returns the current value of the sum.
        return sum.get();
    }
}

class AddTask implements Runnable {

    private final AtomicSum sum;
    private final int start;
    private final int end;

    public AddTask(AtomicSum sum, int start, int end) {
        this.sum = sum;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum.add(i);
        }
    }
}

public class AtomicSumExercise {
    public static void main(String[] args) throws InterruptedException {
        if (args.length < 4) {
            System.out.println("Please provide four arguments: start1 end1 start2 end2");
            return;
        }

        int start1 = Integer.parseInt(args[0]);
        int end1 = Integer.parseInt(args[1]);
        int start2 = Integer.parseInt(args[2]);
        int end2 = Integer.parseInt(args[3]);

        final AtomicSum sum = new AtomicSum();

        Thread t1 = new Thread(new AddTask(sum, start1, end1));
        Thread t2 = new Thread(new AddTask(sum, start2, end2));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final sum value: " + sum.getSum());
    }
}
