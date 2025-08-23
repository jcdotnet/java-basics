package com.example.basics.collections.interfaces;

import java.util.Iterator;

public class CustomCollection implements Iterable<String> {

    private String[] items;
    private int size;

    public CustomCollection(String[] items) {
        this.items = items;
        this.size = items.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public String next() {
            return items[currentIndex++];
        }
    }

    public static void main(String[] args) {
        String[] items = {"Apple", "Banana", "Cherry"};
        CustomCollection collection = new CustomCollection(items);

        // Using enhanced for-loop, which works because CustomCollection implements Iterable
        for (String item : collection) {
            System.out.println(item);
        }
    }
}