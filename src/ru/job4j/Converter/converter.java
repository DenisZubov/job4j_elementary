package ru.job4j.Converter;

public class converter {

    public static int rubleToEuro (int value) {

        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollars (int value) {

        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollars = converter.rubleToDollars(180);
        System.out.println("180 rubles are " + dollars + " dollars.");
    }

}