package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int can = left > right ? left:right;
        return can;
    }
    public static void main(String[] args) {
        int msg = max(52, 56);
        System.out.println(msg);
    }
}