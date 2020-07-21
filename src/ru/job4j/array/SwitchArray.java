package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        return array;
    }
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
    public static int[] swapBorders(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        return array;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorders(nums, 1, 5);
        for (int i = 0; i <= rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
