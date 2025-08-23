package com.example.basics.core.strings;

public class StringsMemory {
    public static void main(String[] args) {
        String str1 = "Hello"; // stored in the string constant pool
        String str2 = "Hello"; // stored in the string constant pool
        String str3 = new String("Hello"); // stored in the heap memory
        String str4 = new String("Hello"); // stored in the heap memory
        System.out.println(str1 == str2); // true
        System.out.println(str3 == str4); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}
