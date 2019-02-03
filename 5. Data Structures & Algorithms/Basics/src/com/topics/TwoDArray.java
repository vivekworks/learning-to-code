package com.topics;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        TwoDArray twoDArray = new TwoDArray();
        twoDArray.initializer();
        twoDArray.construct(4, 6);
        twoDArray.construct(5);
    }

    public void initializer() {
        int[][] a = {{2, 3, 4}, {3, 5, 6}, {2, 5}};
        for (int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));
    }

    public void construct(int row, int column) {
        int[][] twoDArray = new int[row][column];
        int count = 1;
        help:
        for (int i = 0; i < row; i++) {
            group:
            for (int j = 0; j < column; j++) {
                twoDArray[i][j] = count++;
                break group;
            }
        }
        for (var rows : twoDArray) {
            for (var col : rows)
                System.out.print(col + ", ");
            System.out.println();
        }
    }

    public void construct(int row) {
        int[][] twoDArray = new int[row][];
        int count = 1;
        for (int i = 0; i < row; i++) {
            twoDArray[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                twoDArray[i][j] = count++;
            }
        }
        for (int i = 0; i < row; i++)
            System.out.println(Arrays.toString(twoDArray[i]));
    }
}
