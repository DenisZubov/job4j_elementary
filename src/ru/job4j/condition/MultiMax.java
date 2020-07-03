package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {
        int result = a > b ? a : b;
        result = result > c ? result  : c;
        return result;
    }
    public static void main(String[] args) {
        int msg = MultiMax.max(8, 7, 10);
        System.out.println(msg);
    }
}
