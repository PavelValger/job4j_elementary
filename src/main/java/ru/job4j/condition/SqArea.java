package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = SqArea.square(p, k);
        String finish = String.format("%.1f", result);
        System.out.println(" p = 6, k = 2, s = " + finish);
    }
}
