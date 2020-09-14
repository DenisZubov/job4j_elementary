package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int k = 0;
        String slovo = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                slovo = array[i];
                array[i] = null;
                array[k] = slovo;
                k = k + 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}