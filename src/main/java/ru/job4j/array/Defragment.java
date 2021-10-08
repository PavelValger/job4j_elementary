package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int full = index + 1; full < array.length; full++) {
                    if (array[full] != null) {
                        String temp = array[index];
                        array[index] = array[full];
                        array[full] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
