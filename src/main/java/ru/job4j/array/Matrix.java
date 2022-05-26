package ru.job4j.array;

import java.io.FileOutputStream;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            String matrix = Arrays.deepToString(multiple(5));
            String matrixTwo = Arrays.deepToString(multiple(3));
            out.write(matrix.getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write(matrixTwo.getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
