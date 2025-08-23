package com.example.basics.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsSyntax {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        //  ArrayList<double> personArrayList = new ArrayList<>();
        ArrayList arrayList = new ArrayList(); // not specifying a type // NOT recommended
        arrayList.add("String");
        arrayList.add(1);
        arrayList.add(3.14);

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        for (Object item : arrayList) {
            System.out.println(item);
        }
    }

    class Person {
        String name;
    }
}