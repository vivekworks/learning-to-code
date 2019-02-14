package warmup;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount = 0;
        for (int var :apples)
            if ((var + a >= s) && (var + a <= t))
                appleCount++;
        for (int var :oranges)
            if ((var + b >= s) && (var + b <= t))
                orangeCount++;
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}