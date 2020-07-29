package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = false;
        int k = 0;
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][j] == row) {
                    k++;
                    if (k==board.length+1) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {2, 3, 3},
                {1, 2, 2}};
        boolean rsl = monoHorizontal(array, 3);
        System.out.println(rsl);
    }
}