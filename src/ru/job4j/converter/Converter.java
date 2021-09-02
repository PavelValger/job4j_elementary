package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70; /* формула перевода рублей в евро. */
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(370);
        String resulteuro = String.format("%.2f",euro);
        float dollar = Converter.rubleToDollar(370);
        String resultdollar = String.format("%.2f",dollar);
        System.out.println("370 rubles are " + resulteuro + " euro.");
        System.out.println("370 rubles are " + resultdollar + " dollar.");
    }
}
