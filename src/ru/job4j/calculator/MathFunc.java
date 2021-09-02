package ru.job4j.calculator;

public class MathFunc {
    public static float func1(float x) {
        return x * x + 1;
    }

    public static float func2(float x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        float result1 = MathFunc.func1(3);
        float result2 = MathFunc.func2(5);
        float result3 = MathFunc.func1(100);
        float total = result1 + result2;
        System.out.println(total);
        System.out.println(result3);
    }
}
