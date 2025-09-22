package com.example.basics.concurrency.threads.synchronization.example2;

class BankAccount {
    private double balance;

    public synchronized void deposit(double amount) { // makes the deposit method thread-safe
        balance += amount;
    }

    public synchronized void withdraw(double amount) { // makes the withdrawal method thread-safe
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankExercise {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable depositTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100_000; i++) {
                    account.deposit(100);
                }
            }
        };

        Runnable withdrawTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100_000; i++) {
                    account.withdraw(100);
                }
            }
        };

        Thread thread1 = new Thread(depositTask);
        Thread thread2 = new Thread(withdrawTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance should be 0 as 100_000 * 100 - 100_000 * 100 = 0.0
        System.out.println("Final Balance: " + account.getBalance());
    }
}
