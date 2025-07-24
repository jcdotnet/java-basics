package com.example.basics.core.primitives;

public class WrapperMethods {

    public static void main(String[] args) {
//        String intStr = "123";
//        int num = Integer.parseInt(intStr);
//        System.out.println("Parsed int: " + num); // Output: Parsed int: 123
//
//        String floatStr = "3.14";
//        float pi = Float.parseFloat(floatStr);
//        System.out.println("Parsed float: " + pi);

//        Integer num = Integer.valueOf(100);
//        Double pi = Double.valueOf("3.14159");
//
//        System.out.println("Integer object: " + num);  // Output: 100
//        System.out.println("Double object: " + pi);    // Output: 3.14159
////
//        Integer number = 42;
//        String numStr = number.toString();
//
//        System.out.println("String representation: " + numStr);
////
//        Integer num1 = 100;
//        Integer num2 = 150;
//
//        System.out.println(num1.compareTo(num2));  // Output: -1 (num1 < num2)
//        System.out.println(num2.compareTo(100));
//
        Double num = 9.75;

        int intValue = num.intValue();    // Convert to int
        float floatValue = num.floatValue();  // Convert to float

        System.out.println("int value: " + intValue);    // Output: 9
        System.out.println("float value: " + floatValue);  // Output:
//
        System.out.println("Max Integer: " + Integer.MAX_VALUE);  // 2147483647
        System.out.println("Min Integer: " + Integer.MIN_VALUE);  //
    }
}
