package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
    public static void main(String[] args) {
        int[][] value = Matrix.multiple(9);
        int x = value[1][1];
        System.out.println(x);
    }
}
