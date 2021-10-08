package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(350);
        float dollar = Converter.rubleToDollar(600);
        float in = 350;
        float expected = 5;
        float out = Converter.rubleToEuro(in);
        boolean eur = expected == out;
        in = 600;
        expected = 10;
        out = Converter.rubleToDollar(in);
        boolean usd = expected == out;
        System.out.println("350 rubles are " + euro + " euro. " + "Test result : " + eur);
        System.out.println("600 rubles are " + dollar + " dollar. " + "Test result : " + usd);
    }
}
