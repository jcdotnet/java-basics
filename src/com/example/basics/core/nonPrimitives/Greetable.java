package com.example.basics.core.nonPrimitives;

public interface Greetable {
    void greet();
}
enum Day2 implements Greetable {
    MONDAY {
        @Override
        public void greet() {
            System.out.println("Start the week strong!");
        }
    },
    FRIDAY {
        @Override
        public void greet() {
            System.out.println("Almost weekend!");
        }
    },
    SUNDAY {
        @Override
        public void greet() {
            System.out.println("Time to relax!");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Day2.MONDAY.greet();
        Day2.FRIDAY.greet();
        Day2.SUNDAY.greet();
    }
}