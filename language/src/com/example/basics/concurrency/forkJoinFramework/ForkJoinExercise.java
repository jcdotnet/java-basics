package com.example.basics.concurrency.forkJoinFramework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// TODO: FactorialTask should extend RecursiveTask<Long>
class FactorialTask extends RecursiveTask<Long> {

    private final int number;

    // TODO: The constructor should take an integer number
    public FactorialTask(int number) {
        this.number = number;
    }
    /*
        TODO:
        Override the compute method to calculate the factorial of number using a divide-and-conquer approach
        Within the method:
        - If the number is less than or equal to 1, return 1
        - Otherwise, create a new FactorialTask for number - 1 and fork it
        - Use the result of the subtask to calculate the factorial by multiplying number with the result of the subtask
    */

    @Override
    protected Long compute() {
        if (number <= 1) {
            return 1L;
        } else {
            FactorialTask task = new FactorialTask(number-1);
            task.fork();
            // Combine the results to find the overall maximum.
            return number * task.join();
        }
    }
}

public class ForkJoinExercise {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);

        ForkJoinPool pool = new ForkJoinPool();// TODO: Create an instance of ForkJoinPool
        FactorialTask task = new FactorialTask(number); // TODO: Create an instance of FactorialTask with the parsed integer 'number'
        long result = pool.invoke(task); // TODO: Use pool.invoke(task) to get the result of the factorial calculation
        System.out.println("Factorial: " + result);
    }
}