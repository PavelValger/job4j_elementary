package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void nameOfMonday() {
        String name = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
        name = "Monday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfTuesday() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
        name = "Tuesday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfWednesday() {
        String name = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
        name = "Wednesday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfThursday() {
        String name = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
        name = "Thursday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfFriday() {
        String name = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
        name = "Friday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfSaturday() {
        String name = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
        name = "Saturday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfSunday() {
        String name = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
        name = "Sunday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfError() {
        String name = "Вторник3";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(expected, result);
        name = "TuesMonday";
        result = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, result);
    }
}