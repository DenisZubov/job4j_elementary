
package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index<data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static void main(String[] args){
        int value = 3;
        int[] xxx = {1, 2, 3, 4};
        System.out.println (FindLoop.indexOf(xxx, value));
    }
}