package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K7Square273() {
        int p = 10;
        double k = 7;
        double expected = 2.73;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K11Square017() {
        int p = 3;
        double k = 11;
        double expected = 0.17;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}