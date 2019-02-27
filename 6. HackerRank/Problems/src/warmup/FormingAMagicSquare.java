package warmup;

public class FormingAMagicSquare {
    private static int[][] matrix;

    public static int formingMagicSquare(int[][] s) {
        matrix = s;
        int cost = 0;
        System.out.println(checkMagicSquare());
        return cost;
    }

    static boolean checkMagicSquare() {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] + matrix[i][1] + matrix[i][2] != 15)
                return false;
            if (matrix[0][i] + matrix[1][i] + matrix[2][i] != 15)
                return false;
        }
        if (matrix[0][0] + matrix[1][1] + matrix[2][2] != 15)
            return false;
        if (matrix[0][2] + matrix[1][1] + matrix[2][0] != 15)
            return false;
        return true;
    }
}
