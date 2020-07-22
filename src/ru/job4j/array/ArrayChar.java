package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for(int i=0;i<pref.length;i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main ( String[]args){
        char[] x = {'H', 'e', 'l', 'l', 'o'};
        char[] y = {'H', 'e'};
        boolean rsl = startsWith(x,y);
        System.out.println(rsl);
    }

}