package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data){
        for(int i = 0; i < data.length; i++){
                    int chis = MinDiapason.min(data, 0, data.length-1);
                    int index = FindLoop.indexOf(data, chis);
                    int temp = data[i];
                    data[i] = data[index];
                    data[index] = temp;
        }
        return data;
    }
    public static void main(String[] args) {
        int[] array = {0, 4, 2, 1};
        int[] got = SortSelected.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(got[i]);
        }
    }
}