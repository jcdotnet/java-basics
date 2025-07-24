package com.example.basics.core.primitives;

public class Primitives {
    public static void main(String[] args) {
        // The byte data type can store a whole number between -128 and 127
        byte b = 100;
        byte age = 25;

        // Integer Types
        // The short data type can store a whole number between -32,768 and 32,767
        short s = 2000;
        short year = 2020;
        // The int data type can store a whole number between -2,147,483,648 and 2,147,483,647
        int i = 12345;
        int population = 1000000;
        // The long data type can store a whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
        long l = 12345678912L; // interpreted as an int by default
        long l1 = 123456789L; // optional within int range, but mandatory for large numbers
        long distance = 100000000;

        // Float Types
        // The float data type can hold a value from 1.4e-045 to 3.4028235e+38
        float f = 3.14f; //interpreted as double by default
        float weight = 68.5f;
        // The double data type can hold a value from 4.9e-324 to 1.7976931348623157e+308
        double d = 3.14159;
        double height = 178.6;
        // A character data type, also known as char, is used to store a single character, such as a letter, number, or symbol
        char c = 'A';
        char grade = 'A';
        // The Unicode value for the letter A is 65, so we could also initialize the char variable as:
        char grade2 = 65;

        // The boolean data type is used to store a true or false value
        boolean isJavaFun = true; //true or false
        boolean isStudent = true;

    }
}
