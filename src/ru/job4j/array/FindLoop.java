
package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static boolean numOfDip(int[] data, int el, int start, int finish){
            boolean dip = false;
            for (int index = start; index <= finish; index++) {
                if (data[index] == el) {
                    dip = true;
                }
            }
        return dip;
    }
    public static void main(String[] args){
        int value = 3;
        int[] xxx = {1, 2, 3, 4};
        System.out.println (FindLoop.indexOf(xxx, value));
        System.out.println (FindLoop.numOfDip(xxx, 3, 0, 1));

            }
}