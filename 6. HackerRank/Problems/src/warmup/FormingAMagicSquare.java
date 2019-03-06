package warmup;

import java.util.ArrayList;

public class FormingAMagicSquare {
    public static int formingMagicSquare(int[][] s) {
        int maxCost = Integer.MAX_VALUE;
        ArrayList<Integer[][]> allSquares = createAllMagicSquares();
        for (Integer[][] listValue : allSquares) {
            int cost = 0;
            for (int i = 0; i < s.length; i++)
                for (int j = 0; j < s.length; j++)
                    cost += Math.abs(listValue[i][j] - s[i][j]);
            if (cost < maxCost)
                maxCost = cost;
        }
        return maxCost;
    }

    private static ArrayList<Integer[][]> createAllMagicSquares() {
        ArrayList<Integer[][]> allSquares = new ArrayList<>();
        Integer[][] magicSquare1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        allSquares.add(magicSquare1);
        Integer[][] magicSquare2 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        allSquares.add(magicSquare2);
        Integer[][] magicSquare3 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        allSquares.add(magicSquare3);
        Integer[][] magicSquare4 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        allSquares.add(magicSquare4);
        Integer[][] magicSquare5 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        allSquares.add(magicSquare5);
        Integer[][] magicSquare6 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        allSquares.add(magicSquare6);
        Integer[][] magicSquare7 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        allSquares.add(magicSquare7);
        Integer[][] magicSquare8 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        allSquares.add(magicSquare8);
        return allSquares;
    }
}