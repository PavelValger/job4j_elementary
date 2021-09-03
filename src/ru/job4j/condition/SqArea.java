package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p/(2*(k+1)); /* Высота прямоугольника */
        double L = h*k; /* Длина прямоугольника */
        return L*h; /* Площадь прямоугольника */
    }

    public static void main(String[] args) {
        int p = 6; /* Периметр прямоугольника */
        int k = 2; /* Коэффициент */
        double result = SqArea.square(p, k);
        String resultfinish = String.format("%.1f",result);
        System.out.println(" p = 6, k = 2, s = " + resultfinish);
    }
}
