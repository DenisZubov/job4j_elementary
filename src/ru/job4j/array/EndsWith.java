package ru.job4j.array;

public class EndsWith {
    public static boolean ends(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 1; i <= pref.length; i++) {
            if (word[word.length - i] != pref[pref.length - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[]args)
      {char[] x = {'H', 'e', 'l', 'l', 'o'};
        char[] y = {'l', 'o'};
        boolean rsl = ends (x, y);
        System.out.println(rsl);
    }
}