package com.katas.eightQueens;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EightQueens {

    // The 8 Queens puzzle or the N Queens puzzle
    int N = 8;

    public void solve() {
        // multidimensional array of Strings
        int[][] board = new int[N][N];

        // start from the first column and move to N (eight) column
        if (!placeQueen(board, 0)) {
            log.info("No solution found");
        }
    }


    private boolean placeQueen(int[][] board, int col) {

        if (col == N) {
            log.atInfo().log("All queens placed");

            for (int[] row : board) {
                log.atInfo().log(Arrays.toString(row));
            }
            return true;
        }

        // we move one column at a time and then check if its save to place a queen on any of the rows.
        for (int i = 0; i < N; i++) {
            if (isSafeToPlaceQueen(board, i, col)) {
                board[i][col] = 1;
                // this is where we end up with a back track.
                // we maintain the row and col and instead of entering the if statement we have a false and set the current 1 (on row+col) to 0 and continue the loop until we need to backtrack again.
                if (placeQueen(board, col + 1)) {
                    return true;
                }
            }

            // not safe? set a 0 on the board, with backtracking we replace the 1 with a 0
            board[i][col] = 0;
        }
        // return false if all rows have been tested but there is no safe place.
        // By returning false we travel back once in the recursion chain to a place where the column is -1 from this point and with the exact row on which we previously placed the queen.
        // The return false means that we do not enter the if statement on line 41 and set the current row-col which is 1 to 0. After that we continue to find new safe place from that location with row+1 - same column.
        return false;
    }

    /**
     * Checks the following:
     *
     * 1. Is there a queen on the same row for each of the columns already filled in
     * 2. Is there a queen on the same diagonal from the current row+col combination
     * 3. is there a queen on the same anti-diagonal from the current row+col combination
     */
    private boolean isSafeToPlaceQueen(int[][] board, int row, int col) {

        // Cant place the queen of there already is one present on this row.
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // check one left(column) and one up(row) in the board (diagonal)
        for (int i = row, x = col; i >= 0 && x >= 0; i--, x--) {
            // each iteration wll travel one left and one up on the board, if a 1 (queen) is found return false
            // it loops until the row has reached the board size of N and column is back to 0 (the starting point).
            if (board[i][x] == 1) {
                return false;
            }
        }

        // check one left(column) and one down(row) on the board (anti-diagonal)
        for (int i = row, x = col; i < N && x >= 0; i++, x--) {
            // each iteration will travel one left
            if (board[i][x] == 1) {
                return false;
            }
        }
        return true;
    }

}
