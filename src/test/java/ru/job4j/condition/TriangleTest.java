package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNoExist() {
        boolean result = Triangle.exist(2.0, 6.0, 2.0);
        Assert.assertFalse(result);
    }
}