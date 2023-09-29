package com.fctasks.lesson2.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues(){
        //given
        int num1 = 1;
        int num2 = 2;

        //when
        int result = Calculator.add(num1,num2);

        //then
        Assertions.assertEquals(3,result);

    }
    @Test
    void shouldSubstractTwoValues(){
        //given
        int num1 = 3;
        int num2 = 2;

        //when
        int result = Calculator.substract(num1,num2);

        //then
        Assertions.assertEquals(1,result);
    }

    @Test
    void shouldMultiplyTwoValues(){
        //given
        int num1 = 1;
        int num2 = 2;

        //when
        int result = Calculator.multiply(num1,num2);

        //then
        Assertions.assertEquals(2,result);
    }

    @Test
    void shouldDivideTwoValues(){
        //given
        int num1=4;
        int num2=2;

        //when
        double result = Calculator.divide(num1,num2);

        //then
        Assertions.assertEquals(2,result);
    }

}
