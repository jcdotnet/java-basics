package com.example.basics.concurrency.forkJoinFramework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindMaxInteger extends RecursiveTask<Integer> {
    private int[] arr;
    private int start;
    private int end;

    public FindMaxInteger(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 100) {
            // Sequentially find the maximum in the array.
            int max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            // Divide the array into two halves and create subtasks to find the maximum in each half.
            int mid = start + (end - start) / 2;
            FindMaxInteger leftTask = new FindMaxInteger(arr, start, mid);
            FindMaxInteger rightTask = new FindMaxInteger(arr, mid, end);
            leftTask.fork();
            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();
            // Combine the results to find the overall maximum.
            return Math.max(leftResult, rightResult);
        }
    }
}

class DivideAndConquer {
    public static void main(String[] args) {
        int[] array = {13, 51, -5, 0, 12, 743, 16, -9, 33, 96};
        FindMaxInteger task = new FindMaxInteger(array, 0, array.length);
        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(task);
        System.out.println("The max is: " + result);
    }
}
