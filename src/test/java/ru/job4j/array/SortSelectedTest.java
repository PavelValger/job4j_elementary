package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {8, 7, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {3, 9, 0, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 2, 3, 6, 9};
        Assert.assertArrayEquals(expected, result);
    }
}