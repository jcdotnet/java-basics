package com.example.basics.generics;

class Pair<T, U> {

    private T first;
    private U second;

    // TODO: Constructor to initialize the pair
    public Pair(T first, U second) {
        this.first  = first;
        this.second = second;
    }

    // TODO: getFirst() method to get the first element
    public T getFirst() {
        return first;
    }

    // TODO: getSecond() method to get the second element
    public U getSecond() {
        return second;
    }
    // TODO: setFirst(T first) method to set the first element
    public void setFirst(T first) {
        this.first = first;
    }
    // TODO: setSecond(U second) method to set the second element
    public void setSecond(U second) {
        this.second = second;
    }
}


public class PairExercise {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }
}
