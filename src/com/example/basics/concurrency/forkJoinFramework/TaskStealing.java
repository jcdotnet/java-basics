package com.example.basics.concurrency.forkJoinFramework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// this task calculates the sum of integers from 1 to 100
class MyRecursiveTask extends RecursiveTask<Integer> {

    private int start, end;

    public MyRecursiveTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            MyRecursiveTask leftTask = new MyRecursiveTask(start, mid);
            MyRecursiveTask rightTask = new MyRecursiveTask(mid + 1, end);

            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            return leftResult + rightResult;
        }
    }
}
public class TaskStealing {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        MyRecursiveTask task = new MyRecursiveTask(1, 100);

        int result = pool.invoke(task);

        System.out.println(result);
    }
}
