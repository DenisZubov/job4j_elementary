package ru.job4j.array;

public class MinDiapason {
    public static int min(int[] data, int start, int finish) {
        int minn = data[start];
        for (int i = start - 1; i <= finish - 1; i++) {
            if (minn > data[i]) {
                minn = data[i];
            }
        }
        return minn;
    }
    public static void main(String[] args) {
        int[] array = {0, 4, 2, 1};
        System.out.println(MinDiapason.min(array, 1, 3));
    }

}
