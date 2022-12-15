package lesson_3.examples;

import java.util.Arrays;

public class I_ForMultipleInitsExample {

    static String[][] diagonalBoard(int size) {
        String[][] board = new String[size][size];
        for (int x = 0, y = 0; x < size; x++, y++) {
            board[x][y] = "X";
        }
        return board;
    }

    static void printBoard(String[][] board) {
        // foreach loop
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        String[][] board = diagonalBoard(10);
        printBoard(board);
    }
}
