package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70; /* формула перевода рублей в евро. */
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(350);
        float dollar = Converter.rubleToDollar(600);
        //Тестирование программы://
        float in = 350;
        float expected = 5;
        float out = Converter.rubleToEuro(in);
        boolean passedEuro = expected == out;
        in = 600;
        expected = 10;
        out = Converter.rubleToDollar(in);
        boolean passedDollar = expected == out;
        //Вывод результата://
        System.out.println("350 rubles are " + euro + " euro. " + "Test result : " + passedEuro);
        System.out.println("600 rubles are " + dollar + " dollar. " + "Test result : " + passedDollar);
    }
}
