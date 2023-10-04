package com.fctasks.lesson3.task2;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Znachor", "Jerzy Hoffman", 188, 1981);
        Movie movie2 = new Movie("Znachor","Michał Gazda", 200, 2023);
        System.out.println(movie1.movieDetails());
        System.out.println(movie2.movieDetails());
    }
}
