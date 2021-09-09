package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void nameOfMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfTuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfWednesday() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfThursday() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfFriday() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfSaturday() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfSunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfError() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfError2() {
        int day = 0;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}