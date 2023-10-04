package com.fctasks.lesson3.task2;

public class Movie {
    String title;
    String director;
    int duration;
    int year;


    public Movie(String title, String director, int duration, int year){
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.year = year;
    }
    String movieDetails() {
        return "Film pod tytułem " + title + " ,reżyser: " + director + " ,trwa " + duration + " minut i powstał w " + year + " roku.";
    }
}

