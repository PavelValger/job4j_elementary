package ru.job4j.ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a+b+c)/2; /* Полупериметр треугольника */
        double middle = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(middle); /* Площадь треугольника */
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double result = TrgArea.area(a, b, c);
        String resultfinish = String.format("%.2f",result);
        System.out.println("Площадь треугольника (2, 2, 2) = " + resultfinish);
            }
}
