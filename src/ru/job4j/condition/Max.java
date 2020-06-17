package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        String can = left > right ? "Первое яисло больше":"Втоорое число больше";
        return can;
    }
    public static void main(String[] args) {
        String msg = max(72, 56);
        System.out.println(msg);
    }
}