package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) throws IOException {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        if (size < 1 || size > 9) {
            throw new IOException("Некорректный ввод. Введите число от 1 до 9");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
