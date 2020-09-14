package ru.job4j.loop;

public class Board {
    /** @noinspection checkstyle:ParenPad, checkstyle:ParenPad, checkstyle:ParenPad, checkstyle:NeedBraces */
    public static void paint(int width, int height) {
        for (int n = 1; n <= width; n++) {
            for (int m = 1; m <= height; m++)
            if (( n + m ) % 2 == 0) {
                System.out.print("X");
            } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(9, 9);
        System.out.println();
        paint(4, 4);
    }
}