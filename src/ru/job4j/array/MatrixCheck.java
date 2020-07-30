package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row-1][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] array = {
                {'h', 'h', 'h'},
                {'h', 'h', 'h'},
                {'X', 'X', 'X'}};
        boolean rsl = monoHorizontal(array, 3);
        System.out.println(rsl);
    }
}

