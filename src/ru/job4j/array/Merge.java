package ru.job4j.array;

public class Merge {
    public static int[] merge(int[]left, int[]right) {
        int[]rsl = new int[left.length + right.length];
        int x = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            x++;
        }
        for (int j = 0;j < right.length;j++) {
            rsl[x++] = right[j];
        }
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);}
        return rsl;
    }
    public static void main(String[] args) {
        int[]one = {1, 3, 5};
        int[]two = {7, 9};
        int[] three = merge(one, two);
    }
}
