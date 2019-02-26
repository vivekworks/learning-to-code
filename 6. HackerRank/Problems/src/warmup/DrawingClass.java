package warmup;

public class DrawingClass {
    public static int pageCount(int n, int p) {
        if ((n % 2 == 1 && p == n - 1) || (p == 1) || (p == n)) return 0;
        if (n % 2 == 0 && p == n - 1) return 1;
        if (n / 2.0 >= p) return p / 2;
        else return (n - p) / 2;
    }
}
