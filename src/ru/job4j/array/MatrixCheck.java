package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical (char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] != 'X') {
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
        boolean rsl = monoHorizontal(array, 2);
        System.out.println(rsl);
    }
}

