package DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    int count = 0;
    public static void main(String[] args) {
        NQueens queens = new NQueens();
        List<List<String>> boards = queens.solveNQueens(8);
        System.out.println(queens.count);
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        NQueensUtil(board, allBoards, 0);
        return allBoards;
    }

    private void NQueensUtil(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                NQueensUtil(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(int row, int col, char[][] board) {
        // horizontal check
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical check
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }

        // upper left check
        for (int c = col, r = row; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right check
        for (int c = col, r = row; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left check
        for (int c = col, r = row; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right check
        for (int c = col, r = row; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true; // SAFE
    }
    private void saveBoard(char[][] board, List<List<String>> allBoards) {
        StringBuilder row = new StringBuilder();
        List<String> b = new ArrayList<>();
        for (char[] chars : board) {
            row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (chars[j] == 'Q')
                    row.append('Q').append(' ').append(' ');
                else
                    row.append('-').append(' ').append(' ');
            }
            System.out.println(row);
            b.add(row.toString());
        }
        System.out.println();
        allBoards.add(b);
        count++;
    }
}
