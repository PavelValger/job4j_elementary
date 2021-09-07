package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionAndDividing(double first, double second) {
        return subtraction(first, second) + dividing(first, second);
    }

    public static double sum4(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtraction(first, second) + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subtractionAndDividing равен: " + subtractionAndDividing(10, 20));
        System.out.println("Результат расчета sum4 равен: " + sum4(10, 20));
    }
}
