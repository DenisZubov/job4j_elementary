package ru.job4j.array;

public class Turn {
    public static int[] swap(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }
    public static void main ( String[]args){
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] rsl = swap(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }

}
