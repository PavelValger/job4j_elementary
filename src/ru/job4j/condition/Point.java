package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double stepone = x2 - x1;
        double steptwo = y2 - y1;
        double stepthree = Math.pow(stepone, 2);
        double stepfour = Math.pow(steptwo, 2);
        double stepfive = stepthree + stepfour;
        return Math.sqrt(stepfive);
            }

    public static void main(String[] args) {
        int x1 = 2; /* абсцисса точки А */
        int y1 = 9; /* ордината точки А */
        int x2 = 5; /* абсцисса точки Б*/
        int y2 = 6; /* ордината точки Б */
        double result = Point.distance(x1, y1, x2, y2);
        String resultfinish = String.format("%.2f",result);
        System.out.println("расстояние между двумя точками А (2, 9) и Б (5, 6) равно " + resultfinish);
    }
}
