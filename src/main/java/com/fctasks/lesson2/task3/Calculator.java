package com.fctasks.lesson2.task3;

public class Calculator {

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int substract(int num1, int num2){
        return num1-num2;
    }

    public static int multiply(int num1, int num2){
        return num1*num2;
    }

    public static double divide(double num1, double num2){
        if (num2==0){
            System.out.println("Dzielenie przez 0");
        }
        return num1/num2;
    }
}
