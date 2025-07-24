package com.example.basics.generics;

public class MyClass<T> {

    private T myVar;

    public MyClass(T myVar) {
        this.myVar = myVar;
    }

    public T getMyVar() {
        return myVar;
    }

    public void setMyVar(T myVar) {
        this.myVar = myVar;
    }
}

class MyClassTest {
    public static void main(String[] args) {
        MyClass<String> myString = new MyClass<>("Hello World!"); // <> - is a diamond operator
//      MyClass<String> myString = new MyClass<String>("Hello World!"); // this line means the same as the line above
        System.out.println(myString.getMyVar());
    }
}
