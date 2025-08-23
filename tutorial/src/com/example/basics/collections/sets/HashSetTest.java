package com.example.basics.collections.sets;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Pineapple");
        System.out.println(set);
        set.remove("Orange");
        System.out.println(set);
        System.out.println(set.contains("Banana"));  // Output: true
        System.out.println(set.size());              // Output: 2
        set.clear();
        System.out.println(set);

        String s1 = "Aa";
        String s2 = "BB";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}