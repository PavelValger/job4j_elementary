package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15; /* формула вычисления идеального веса мужчины. */
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15; /* формула вычисления идеального веса женщины. */
    }

    public static void main(String[] args) {
        short height = 182;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 182 is " + man);
        System.out.println("Woman 182 is " + woman);
    }

}
