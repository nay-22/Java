package DSA.Backtracking;

import java.util.Scanner;

public class Test {
    private static final int n = 0;
    private static char[][] board = new char[n][n];
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N : ");
        int n = in.nextInt();
        NQueens(n);
    }

    public static void NQueens(int n) {
        NQueensUtil(0);
    }

    private static void NQueensUtil(int col) {
        if (col == board.length) {
            printQueensBoard(board);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 'Q';
                NQueensUtil(col++);
                board[row][col] = '-';
            }
        }
    }

    private static void printQueensBoard(char[][] board) {

    }

    private static boolean isSafe(int row, int col) {
        return false;
    }
}
