package com.example.basics.concurrency.threads.groups;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup myThreadGroup = new ThreadGroup("myThreadGroup");
        Thread myThread = new Thread(myThreadGroup, "myThread");
        System.out.println("Thread is created in group " + myThread.getThreadGroup().getName());
    }
}
