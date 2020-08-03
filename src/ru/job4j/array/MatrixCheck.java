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

    public static char[] extractDiagonal(char[][] board) {
        char[] array = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            array[i] = board[i][i];
            System.out.println(array[i]);
        }
        return array;
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
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 'X') {
                result = monoHorizontal(board, i);
                if (result == false) {
                    result = monoVertical(board, i);
                }
            }
                }
        return result;
        }


    public static void main(String[] args) {
        char[][] array = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'h', 'g', 'j'},
                {'y', 'X', 'h', 'g', 'j'},
                {'X', 'X', 'h', 'g', 'j'},
                {'X', 'X', 'h', 'g', 'j'}};
        boolean rsl = monoHorizontal(array, 2);
        System.out.println(rsl);
        char max[] = extractDiagonal(array);
        boolean k = monoVertical(array,0);
        boolean x = isWin(array);
        System.out.println(k);
    }
}
