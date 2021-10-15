package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 9;
        int x2 = 5;
        int y2 = 6;
        double result = Point.distance(x1, y1, x2, y2);
        String finish = String.format("%.2f", result);
        System.out.println("расстояние между двумя точками А (2, 9) и Б (5, 6) равно " + finish);
    }
}
