package com.fctasks.lesson3.task1;

public class Main {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema(1,12,"free");
        Cinema cinema2 = new Cinema(1,22,"not available");
        System.out.println(cinema1.placeStatus());
        System.out.println(cinema2.placeStatus());
    }
}
