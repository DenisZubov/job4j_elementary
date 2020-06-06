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
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
   }

}
