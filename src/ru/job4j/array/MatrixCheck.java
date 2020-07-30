package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row-1][j] != row) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] array = {
                {1, 1, 1},
                {1, 13, 23},
                {3, 3, 3}};
        boolean rsl = monoHorizontal(array, 3);
        System.out.println(rsl);
    }
}

