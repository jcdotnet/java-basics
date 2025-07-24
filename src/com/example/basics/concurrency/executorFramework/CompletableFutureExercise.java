package com.example.basics.concurrency.executorFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class FactorialCalculator {

    public CompletableFuture<Integer> calculateFactorial(int number) {
        /*
            TODO:
            - Use CompletableFuture.supplyAsync with an anonymous class implementing Supplier<Integer> to perform the calculation asynchronously.
            - Override the 'get' method within the anonymous class, where calculate the factorial of the given number using a loop.
        */

        return CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                // TODO: calculate the factorial of the given number using a loop
                int factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                return factorial;
            }
        });
    }
}

public class CompletableFutureExercise {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);

        FactorialCalculator calculator = new FactorialCalculator();// TODO: Create an instance of FactorialCalculator
        CompletableFuture<Integer> futureResult = calculator.calculateFactorial(number); // TODO: Call 'calculateFactorial' on the FactorialCalculator instance, passing the parsed integer 'number'

        try {
            Integer result = futureResult.get(); // TODO: Retrieve the result from the CompletableFuture
                    System.out.println("Factorial: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
