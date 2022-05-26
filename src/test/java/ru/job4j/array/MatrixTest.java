package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class MatrixTest {

    @Test
    public void when2on2() throws IOException {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5on5() throws IOException {
        int size = 5;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test (expected = IOException.class)
    public void when10thenException() throws IOException {
        int size = 10;
        Matrix.multiple(size);
    }
}