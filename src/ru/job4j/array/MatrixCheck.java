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
        for (char[] chars : board) {
            if (chars[row] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        char[][] array = {
                {'h', 'h', 'h'},
                {'h', 'z', 'h'},
                {'X', 'X', 'X'}};
        boolean rsl = monoHorizontal(array, 2);
        System.out.println(rsl);
        char max[] = extractDiagonal(array);
    }

}
