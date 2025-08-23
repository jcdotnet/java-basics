package com.example.basics.concurrency.forkJoinFramework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class SumArray extends RecursiveAction {
    private static final int THRESHOLD = 1000;
    private int[] array;
    private int start;
    private int end;

    public SumArray(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            // Compute the sum sequentially
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            System.out.println("Sum of array[" + start + ".." + end + "): " + sum);
        } else {
            // Split the array in half and fork the two halves for parallel processing
            int mid = (start + end) / 2;
            SumArray left = new SumArray(array, start, mid);
            SumArray right = new SumArray(array, mid, end);
            invokeAll(left, right);
        }
    }
}

public class RecursiveActionExample {
    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        SumArray task = new SumArray(array, 0, array.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        pool.shutdown();
    }
}
