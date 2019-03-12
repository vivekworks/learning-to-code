package challenges;

public class CountingValleys {
    public static int countingValleys(int n, String s) {
        int valley = 0, maxValley = 0;
        for (char val : s.toCharArray()) {
            if(valley==0 && val=='D')
                maxValley++;
            if(val=='U') valley--;
            else valley++;
        }
        return maxValley;
    }
}
