package com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j||j==n-i-1)
                    array[i][j] = 1;
                else
                    array[i][j] = 0;

            }
        }

        System.out.println("INPUT: " + Arrays.deepToString(array));
    }


}

