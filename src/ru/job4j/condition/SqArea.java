package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1)); /* Высота прямоугольника */
        double l = h * k; /* Длина прямоугольника */
        return l * h; /* Площадь прямоугольника */
    }

    public static void main(String[] args) {
        double p = 6; /* Периметр прямоугольника */
        double k = 2; /* Коэффициент */
        double result = SqArea.square(p, k);
        String resultfinish = String.format("%.1f", result);
        System.out.println(" p = 6, k = 2, s = " + resultfinish);
    }
}
