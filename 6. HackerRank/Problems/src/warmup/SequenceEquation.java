package warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceEquation {
    public static int[] permutationEquation(int[] p, boolean ind) {
        int[] result = new int[p.length];
        if (ind) {
            List<Integer> sequenceList = Arrays.stream(p).boxed().collect(Collectors.toList());
            for (int i = 1, len = p.length; i <= len; i++)
                result[i - 1] = sequenceList.indexOf(sequenceList.indexOf(i) + 1) + 1;
        } else {
            for (int i = 1, len = p.length; i <= len; i++)
                result[i - 1] = indexOf(indexOf(i, p) + 1, p) + 1;
        }
        return result;
    }

    private static int indexOf(int value, int[] p) {
        for (int i = 0, n = p.length; i < n; i++)
            if (p[i] == value)
                return i;
        return -1;
    }
}
