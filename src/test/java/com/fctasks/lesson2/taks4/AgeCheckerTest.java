package com.fctasks.lesson2.taks4;

import com.fctasks.lesson2.task4.AgeChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeCheckerTest {

    @Test
    void checkIsAdultWhenAgeIsLessThan18(){
        //given
        int age = 17;

        //when
        boolean result= AgeChecker.isAdult(age);

        //then
        Assertions.assertFalse(result);

    }

    @Test
    void checkIsAdultWhenAgeIsEqualTo18(){
        //given
        int age = 18;

        //when
        boolean result= AgeChecker.isAdult(age);

        //then
        Assertions.assertTrue(result);

    }

    @Test
    void checkIsAdultWhenAgeIsGreaterThan18(){
        //given
        int age = 19;

        //when
        boolean result= AgeChecker.isAdult(age);

        //then
        Assertions.assertTrue(result);

    }

}
