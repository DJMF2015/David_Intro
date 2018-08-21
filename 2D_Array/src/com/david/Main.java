package com.david;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // initializing double array
        int[][] board = new int[5][5];

        //initialise two dimensional array and loop over

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = i + j;
            }
        }
        for (int[] a : board) {
            for (int[] i : board) {
                System.out.print("\t");
            }
           System.out.println("\n");System.out.println("another way to print 2D arrays");
           System.out.print(Arrays.deepToString(board));
        }

        int[][][] threeD = {
                {
                        {11, 22, 33, 44, 55},
                        {32, 42, 52, 62, 72},},
                {
                        {1111, 2222, 3333, 4444, 5555},
                        {1001, 2001, 3001, 4001, 5001},}

        };
        System.out.println(threeD.toString());
        String threeDString = Arrays.deepToString(threeD);
        System.out.println("3 dimensional array as String in Java : " + threeDString);
    }
    }



