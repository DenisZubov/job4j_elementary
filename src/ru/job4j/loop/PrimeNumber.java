package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish ) {
        int k = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                k = k + 1;
            }
        }
        return k;
    }
    public static void main (String args[]) {
        System.out.println(calc(17));
    }
}