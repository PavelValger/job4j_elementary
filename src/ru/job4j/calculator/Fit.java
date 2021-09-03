package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15; /* формула вычисления идеального веса мужчины. */
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15; /* формула вычисления идеального веса женщины. */
    }

    public static void main(String[] args) {
        short height = 181;
        double man = Fit.manWeight(height);
        String resultman = String.format("%.2f",man);
        double woman = Fit.womanWeight(height);
        String resultwoman = String.format("%.2f",woman);

        System.out.println("Man 181 is " + resultman);
        System.out.println("Woman 181 is " + resultwoman);
    }

}
