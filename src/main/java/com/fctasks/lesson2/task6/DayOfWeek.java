package com.fctasks.lesson2.task6;

public class DayOfWeek {



    public static String day(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                return "Monday";
            case 2:
                System.out.println("Tuesday");
                return "Tuesday";
            case 3:
                System.out.println("Wednesday");
                return "Wednesday";
            case 4:
                System.out.println("Thurdsay");
                return "Thurdsay";
            case 5:
                System.out.println("Friday");
                return "Friday";
            case 6:
            case 7:
                System.out.println("Weekend");
                return "Weekend";
            default:
                System.out.println("There is no such a day!");
                return "There is no such a day!";

        }
    }
}
