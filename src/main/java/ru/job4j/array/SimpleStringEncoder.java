package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder rsl = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
                continue;
            }
            rsl = counter == 1 ? rsl.append(symbol) : rsl.append(symbol).append(counter);
            counter = 1;
            symbol = input.charAt(i);
        }
        return counter == 1 ? (rsl.append(symbol)).toString() : (rsl.append(symbol).append(counter)).toString();
    }
}
