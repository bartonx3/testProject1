package com.fctasks.lesson2.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfWeekTest {

    @Test
    public void testGetDayOfWeekForMonday() {
        // Given
        int dayNumber = 1;

        // When
        String result = DayOfWeek.day(dayNumber);

        // Then
        Assertions.assertEquals("Monday", result);
    }

    @Test
    public void testGetDayOfWeekForFriday() {
        // Given
        int dayNumber = 5;

        // When
        String result = DayOfWeek.day(dayNumber);

        // Then
        Assertions.assertEquals("Friday", result);
    }

    @Test
    public void testGetDayOfWeekForWeekend() {
        // Given
        int dayNumber = 6;

        // When
        String result = DayOfWeek.day(dayNumber);

        // Then
        Assertions.assertEquals("Weekend", result);
    }

    @Test
    public void testGetDayOfWeekForInvalidDay() {
        // Given
        int dayNumber = 8;

        // When
        String result = DayOfWeek.day(dayNumber);

        // Then
        Assertions.assertEquals("There is no such a day!", result);
    }
}

