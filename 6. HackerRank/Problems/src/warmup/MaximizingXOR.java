package warmup;

public class MaximizingXOR {
    public static int maximizingXor(int l, int r) {
        int max = 0;
        for (int i = Math.min(l, r); i < Math.max(l, r) + 1; i++)
            for (int j = i; j < Math.max(l, r) + 1; j++)
                max = Math.max((i ^ j), max);
        return max;
    }
}
