package Charan.MorePackages;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe");
        Scanner sc = new Scanner(System.in);
        int turn = 0;
        System.out.print("Player 1 Symbol: ");
        char player1Symbol = sc.next().charAt(0);
        System.out.print("Player 2 Symbol: ");
        player1Symbol = Character.toUpperCase(player1Symbol);
        char player2Symbol = sc.next().charAt(0);
        player2Symbol = Character.toUpperCase(player2Symbol);

        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        printBoard(board);
        while (true) {
            System.out.println("Player " + (++turn));
            System.out.print("Enter row and column position: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (turn % 2 == 1) {
                placePiece(row, col, board, player1Symbol);
            } else {
                placePiece(row, col, board, player2Symbol);
            }
            turn %= 2;
        }
    }

    public static void placePiece(int row, int col, char[][] board, char symbol) {
        board[--row][--col] = symbol;
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        int rowLen = board.length;
        int colLen = board[0].length;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
