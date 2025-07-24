package com.example.basics.core.strings;

public class StringsConcat {

    public static void main(String[] args) {
//        String s = "Hello"; // Immutable
//        for (int i = 0; i < 5; i++) {
//            s += i;// This creates a new String object in memory
//        }
//
//        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello"); // Mutable
        sb.append(" World");
        System.out.println(sb);  // Output: "Hello World"


        //example of string buffer
//        StringBuffer stringBuffer = new StringBuffer("Hello"); // Mutable, synchronized and thread-safe
//        stringBuffer.append(" World");
//        System.out.println(stringBuffer);  // Output: "Hello World"

    }
}