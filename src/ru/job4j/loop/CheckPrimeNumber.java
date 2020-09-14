package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int n) {
        boolean prime = n > 1;
        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main (String args[]) {

        System.out.println(check(18));
    }
}