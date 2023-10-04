package com.fctasks.lesson3.task1;

public class Cinema{
    int place;
    int row;
    String status;

    public Cinema(int place, int row, String status){
        this.place = place;
        this.row = row;
        this.status = status;
    }

    String placeStatus(){
        return "Place " + place + " in row " + row + " is " + status;
    }

}
