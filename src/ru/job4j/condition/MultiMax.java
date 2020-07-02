package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {
        int d = a>b ? (d=a):(d=b);
        int e = d > c ? (e=d) : (e=c);
        return e;
    }
    public static void main(String[] args) {
        int msg = MultiMax.max(8, 7, 9);
        System.out.println(msg);
    }
}
