package com.example.basics.core.nonPrimitives;


enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum DayOfWeek {

    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    private final String shortName;

    DayOfWeek(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}

enum ShapeType {
    CIRCLE,
    SQUARE,
    TRIANGLE
}

enum Suit {

    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES
}

class Card {

    private Suit suit;

    public Card(Suit suit) {
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

enum Planet {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class EnumTest {
    public static void main(String[] args) {
        Day tuesday = Day.TUESDAY;
        System.out.println(Day.TUESDAY == tuesday);
        System.out.println(Day.TUESDAY.equals(tuesday));

        DayOfWeek today = DayOfWeek.WEDNESDAY;

        if (today == DayOfWeek.WEDNESDAY) {
            System.out.println("Today is Wednesday");
        }

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }

        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);
        }

        final DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday);
        System.out.println(monday.getShortName());

        ShapeType circle = ShapeType.CIRCLE;
        ShapeType square = ShapeType.SQUARE;
        ShapeType triangle = ShapeType.TRIANGLE;

        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);

//        ShapeType rectangle = ShapeType.RECTANGLE; // This will result in a compile-time error

        Card card = new Card(Suit.DIAMONDS);
        System.out.println(card.getSuit());

        System.out.println(Planet.MARS.ordinal());

        System.out.println(Month.MAY.name());
    }
}
