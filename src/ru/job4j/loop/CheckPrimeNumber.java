package ru.job4j.loop;

public class CheckPrimeNumber {

            public static boolean check(int n) {
                boolean prime = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                    }
                }
                return prime;
            }
            public static void main (String args[]) {

                System.out.println(check(4));
    }
}