package challenges;

import java.util.Arrays;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, int[] S) {
        int subset, output = 0;
        int[] subsetArray;
        for (int i = 0, len = S.length; i < len; i++) {
            for (int j = i; j < len; j++) {
                subsetArray = new int[S.length];
                subset = 0;
                subsetArray[subset++] = S[j];
                for (int l = j + 1; l < len; l++)
                    if (isValid(S[l], subsetArray, k))
                        subsetArray[subset++] = S[l];
                if (subset > output)
                    output = subset;
                if(subset==3)
                    System.out.println(Arrays.toString(subsetArray));
            }
        }
        return output;
    }

    private static boolean isValid(int entrant, int[] subsetArray, int divisor) {
        for (int setValue : subsetArray)
            if ((setValue + entrant) % divisor == 0)
                return false;
        return true;
    }
}
