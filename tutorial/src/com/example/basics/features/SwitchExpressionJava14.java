package com.example.basics.features;

public class SwitchExpressionJava14 {
    public static void main(String[] args) {
        newSwitchExpression();
    }

    private static void switchWithColonDelimeter() {
        int day = 3;

        String dayType = switch (day) {
            case 1:
            case 7:
                yield "Weekend";
            default:
                yield "Weekday";
        };
    }

    private static void traditionalSwitch() {
        int day = 3;
        String dayType;
        switch (day) {
            case 1:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Weekday";
                break;
        }
    }

    private static void newSwitchExpression() {
        int score = 10;

        String grade = switch (score) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                if (score < 0) {
                    yield "Invalid score";
                } else {
                    yield "F";
                }
            }
        };
        System.out.println("Grade: " + grade);
    }
}
