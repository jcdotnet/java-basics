package com.example.basics.oop.abstraction;

public abstract class Example {

    public static final String A = "A";
    private String b;

    public Example() {
        System.out.println("Abstract class constructor");
    }

    abstract void a();

    void b() {
        System.out.println("Implementation");
    }
}

class AImplementation extends Example {

    @Override
    void a() {
        System.out.println("A implementation");
    }
}
class Main {
    public static void main(String[] args) {

        Example example = new Example() {
            @Override
            void a() {
                System.out.println("A");
            }
        };
        example.a();

        InterfaceA interfaceA = new InterfaceA() {
            @Override
            public void a() {
                System.out.println("A");
            }
        };
        interfaceA.a();
    }
}
