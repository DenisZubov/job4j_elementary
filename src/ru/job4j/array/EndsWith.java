package ru.job4j.array;

public class EndsWith {
    public static boolean EndWith (char[] word, char[] pref) {
        boolean result = true;
        for (int i = 1; i<=pref.length; i++) {
            if (word[word.length-i] != pref[pref.length-i]) {
                result = false;
            }
        }
        return result;
    }
    public static void main ( String[]args){
        char[] x = {'H', 'e', 'l', 'l', 'o'};
        char[] y = {'l', 'o'};
        boolean rsl = EndWith (x,y);
        System.out.println(rsl);
    }
}