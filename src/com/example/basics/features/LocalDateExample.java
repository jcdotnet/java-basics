package com.example.basics.features;

import java.time.LocalDate; // introduced in Java 8

public class LocalDateExample {

    public static void main (String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date  = LocalDate.of(2025, 7, 19 );

        System.out.println("Today: " + today);
        System.out.println("Date: " + date);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
    }
}
