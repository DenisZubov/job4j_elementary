package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int m = 1; m <= n; m++) {
            result = result*m;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calc(11));
        System.out.println(calc(14));
        System.out.println(calc(10));
    }

}