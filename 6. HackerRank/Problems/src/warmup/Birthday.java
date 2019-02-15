package warmup;

import java.util.List;

public class Birthday {
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++)
                sum += s.get(j);
            if (sum == d)
                result++;
        }
        return result;
    }
}
