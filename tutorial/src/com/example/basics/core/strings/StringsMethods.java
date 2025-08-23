package com.example.basics.core.strings;

public class StringsMethods {

    public static void main(String[] args) {
//        String s = "Hello";
//        String k = new String("Hello");
//        System.out.println(s);
//        System.out.println(k);
//
//        String s1 = "Hello";  // String literal
//        String s3 = new String("Hello");  // Creates a new object in heap
//
//        System.out.println(s1 == "Hello");  // true, both reference the same object in the pool
//        System.out.println(s1 == s3);  // false, s1 and s3 reference different objects
//
//        s1 = s1 + " World";
//        System.out.println(s1);

        // stringMethods();
        compareStrings();


    }

    private static void stringMethods() {
        String s = "Hello World";
        // length(): Returns the length of the string.
        System.out.println("method length() " + s.length());

        // charAt(int index): Returns the character at the specified index.
        System.out.println("method charAt() " + s.charAt(1));

        // substring(int beginIndex, int endIndex): Extracts a portion of the string.
        System.out.println("method substring() " + s.substring(0, 5));  // Output: "Hello"
        System.out.println("method substring() " + s.substring(3));  // Output: "Hello"

        // toLowerCase() and toUpperCase(): Converts the string to lowercase or uppercase.
        System.out.println("method toLowerCase() " + s.toLowerCase());
        System.out.println("method toUpperCase() " + s.toUpperCase());

        // trim(): Removes leading and trailing whitespace from the string.
        System.out.println("method trim() " + " Hello World ".trim());  // Output: "Hello World"

        // replace(char oldChar, char newChar): Replaces occurrences of a character.
        System.out.println("method replace() " + s.replace('l', 'p'));  // Output: "Heppo"

        // contains(CharSequence s): Checks if the string contains a specific sequence of characters.
        System.out.println("method contains() " + s.contains("World"));

        // startsWith(String prefix) and endsWith(String suffix): Checks if the string starts or ends with a specific prefix or suffix.
        System.out.println("method startsWith() " + s.startsWith("Hello"));  // Output: true
        System.out.println("method endsWith() " + s.endsWith("World"));  // Outp

        // equals(Object obj): Compares two strings for equality (compares the content, not references).
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("method equals() " + s1.equals(s2));

        // equalsIgnoreCase(String anotherString): Compares two strings for equality, ignoring case differences.
        System.out.println("method equalsIgnoreCase() " + s1.equalsIgnoreCase(s2));  // Output: true

        // indexOf(String str): Returns the index of the first occurrence of the specified substring.
        System.out.println("method indexOf() " + s.indexOf("World"));  // Output: 6

        //String immutability
        // If you call substring or other methods on string, it will not change string itself, it will create new one
        System.out.println(s1.substring(0, 2));
        System.out.println(s1);
    }

    private static void compareStrings() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2 " + (s1 == s2));  // true (because they refer to the same object in the String pool)
        System.out.println("s1 == s3 " + (s1 == s3.intern()));  // false (s3 refers to a different object in the heap)

        // System.out.println(s1.equals(s3));  // true (compares content)
//        System.out.println("COMPARE");
        //  System.out.println("Apple".compareTo("Banana"));  // Output: -1 (because "Apple" comes before "Banana")


    }
}
