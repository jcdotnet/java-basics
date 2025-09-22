package com.example.basics.oop.abstraction;

public interface InterfaceA {

    String A = "A";
    void a();
    default void method() {
        System.out.println("method");
    }
}
interface InterfaceB {

    public static final String B = "b";
    public void b();
}
class A implements InterfaceA, InterfaceB {

    public void a() {
        System.out.println("A");
    }

    public void b() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        InterfaceA interfaceA = new A();
        interfaceA.a();

        InterfaceB interfaceB = new A();
    }
}