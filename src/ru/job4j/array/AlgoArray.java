package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        //array[0] = array[3];
        //array[3] = temp;

        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array.length; i++) {
                if (array[index] < array[i]) {
                    temp = array[index];
                    array[index] = temp;
                    array[index] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}