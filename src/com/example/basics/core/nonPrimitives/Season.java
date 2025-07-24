package com.example.basics.core.nonPrimitives;

public enum Season {
    WINTER("Cold"),
    SPRING("Mild"),
    SUMMER("Hot"),
    FALL("Cool");

    private String weather;

    // Enum constructor
    Season(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }
}
class Main1 {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println("The weather in " + season + " is " + season.getWeather());
    }
}
