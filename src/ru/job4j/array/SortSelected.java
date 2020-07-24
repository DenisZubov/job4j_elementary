package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int id = i;
            for (int k = i+1; k < data.length; k++) {
                if (data[k] < min) {
                    min = data[k];
                    id = k;
                }
            }
            int temp = data[i];
            data[i] = min;
            data[id] = temp;
        }
        return data;
    }
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        SortSelected.sort(array);
        for (int i = 0; i<array.length;i++){
        System.out.println(array[i]);
        }
    }
}



