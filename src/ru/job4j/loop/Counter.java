package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start=0; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }
    /** @noinspection checkstyle:NoWhitespaceBefore*/
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( start = 1; start <= finish; start++ )
            if (start % 2 == 0) {
                sum = sum + start;
            }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 11));
        System.out.println(sum(0, 124));
        System.out.println(sum(12, 1002));
    }
}
