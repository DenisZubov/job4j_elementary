package ru.job4j.condition;

public class ThrreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }
    public static void main(String[] args) {
        int msg = ThrreeMax.max(6, 7, 5);
        System.out.println(msg);
    }
}