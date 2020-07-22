package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data, int k) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data [k] != data[i]) {
                result = false;
            }
        }
        return result;
    }
    public static void main ( String[]args){
        boolean[] nums = new boolean[]{true, false, false};
        boolean rsl = mono(nums,0);
        System.out.println(rsl);
        }

}