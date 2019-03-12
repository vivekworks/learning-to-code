package challenges;

public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        while (true) {
            x1 += v1;
            x2 += v2;
            if (x1 >= 0 && x2 >= 0) {
                if (x1 == x2)
                    return "YES";
            } else
                break;
        }
        return "NO";
    }
}
