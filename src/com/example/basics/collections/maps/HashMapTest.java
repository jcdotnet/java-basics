package com.example.basics.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Apple", 100);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put(null, null);
        System.out.println(map);

        System.out.println("Method get: " + map.get("Banana"));
        System.out.println("Method containsKey " + map.containsKey("Banana"));
        System.out.println("Method containsValue " + map.containsValue(20));
        System.out.println("Method size " + map.size());
        map.remove("Orange");
        System.out.println(map);

        //0.75 12 out of 16
        HashMap<String, Integer> map1 = new HashMap<>(32, 0.5f);
        map1.put("Apple", 10);
        map1.put("Banana", 20);


        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (String key : map1.keySet()) {
            System.out.println(key);
        }

        for (Integer value : map1.values()) {
            System.out.println(value);
        }

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Alice", 25);
        map2.put("Bob", 30);
        map2.put("Charlie", 35);
        System.out.println(map);

        Integer age = map2.get("Bob");
        System.out.println("Bob's age: " + age);

        Integer removedAge = map2.remove("Charlie");
        System.out.println("Removed age (Charlie): " + removedAge);
        System.out.println(map2);

        Map<String, String> studentTeacher = new HashMap<>();
        studentTeacher.put("John Doe", "Ms. Smith");
        studentTeacher.put("Jane Doe", "Mr. Johnson");
        studentTeacher.put("Jim Brown", "Ms. Smith");

        System.out.println("John Doe's teacher: " + studentTeacher.get("John Doe"));
        System.out.println("Jane Doe's teacher: " + studentTeacher.get("Jane Doe"));
        System.out.println("Jim Brown's teacher: " + studentTeacher.get("Jim Brown"));

    }
}