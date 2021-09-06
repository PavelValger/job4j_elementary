package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = -5;
        boolean result = LogicNot.isEven(num);
        System.out.println("Число " + num + " четное? " + result);
        boolean result1 = LogicNot.isPositive(num);
        System.out.println("Число " + num + " положительное? " + result1);
        boolean result2 = LogicNot.notEven(num);
        System.out.println("Число " + num + " нечетное? " + result2);
        boolean result3 = LogicNot.notPositive(num);
        System.out.println("Число " + num + " отрицательное? " + result3);
        boolean result4 = LogicNot.notEvenAndPositive(num);
        System.out.println("Число " + num + " нечетное и положительное? " + result4);
        boolean result5 = LogicNot.evenOrNotPositive(num);
        System.out.println("Число " + num + " четное или отрицательное? " + result5);
    }
}
