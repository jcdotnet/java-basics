package com.example.basics.core.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        //throw new FileNotFoundException();
//        try {
//            FileReader file = new FileReader("file.txt");
//            file.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("file not found");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String str = null;
//        System.out.println(str.length());  // Throws NullPointerException at runtime

        //int[] arr = new int[Integer.MAX_VALUE];  // May throw OutOfMemoryError
//
        try {
            // int result = 10 / 0;  // This will throw ArithmeticException
            Integer.parseInt("123a");
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");  // Always executed
        }
//


        throw new MyRuntimeException();

    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
        System.out.println("Custom exception constructor");
    }
}

class MyRuntimeException extends RuntimeException {

}