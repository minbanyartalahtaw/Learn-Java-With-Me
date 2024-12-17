/*
    name - Min Banyar Tala Htaw
    id - 6715168
    section - 542
 */

package classEx4;

import java.util.Scanner;

public class MyTicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char currentPlayer = 'X';
        boolean gameOn = true;

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard(board);

        while (gameOn) {
            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Enter column (1-3): ");
            int col = scanner.nextInt() - 1;

            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard(board);

            char winner = whoWin(board);
            if (winner != 'N') {
                System.out.println("Player " + winner + " wins!");
                gameOn = false;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameOn = false;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

    public static char whoWin(char[][] tttBoard) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (tttBoard[i][0] != ' ' && tttBoard[i][0] == tttBoard[i][1] && tttBoard[i][1] == tttBoard[i][2]) {
                return tttBoard[i][0];
            }
            if (tttBoard[0][i] != ' ' && tttBoard[0][i] == tttBoard[1][i] && tttBoard[1][i] == tttBoard[2][i]) {
                return tttBoard[0][i];
            }
        }

        // Check diagonals
        if (tttBoard[0][0] != ' ' && tttBoard[0][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][2]) {
            return tttBoard[0][0];
        }
        if (tttBoard[0][2] != ' ' && tttBoard[0][2] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][0]) {
            return tttBoard[0][2];
        }

        // No winner
        return 'N';
    }

    public static void printBoard(char[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
