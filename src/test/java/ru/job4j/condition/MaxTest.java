package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To7Then100() {
        int left = 100;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax18To25Then25() {
        int left = 18;
        int right = 25;
        int result = Max.max(left, right);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax77To77Then77() {
        int left = 77;
        int right = 77;
        int result = Max.max(left, right);
        int expected = 77;
        Assert.assertEquals(result, expected);
    }
}