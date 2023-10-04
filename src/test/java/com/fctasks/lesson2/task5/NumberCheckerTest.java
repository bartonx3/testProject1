package com.fctasks.lesson2.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberCheckerTest {
    @Test
    public void testIsEvenWhenNumberIsEven() {
        // Given
        int number = 4;

        // When
        boolean result = NumberChecker.isEven(number);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsEvenWhenNumberIsOdd() {
        // Given
        int number = 5;

        // When
        boolean result = NumberChecker.isEven(number);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsOddWhenNumberIsOdd() {
        // Given
        int number = 7;

        // When
        boolean result = NumberChecker.isOdd(number);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsOddWhenNumberIsEven() {
        // Given
        int number = 8;

        // When
        boolean result = NumberChecker.isOdd(number);

        // Then
        Assertions.assertFalse(result);
    }
}






