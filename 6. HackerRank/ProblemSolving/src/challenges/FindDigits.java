package challenges;

public class FindDigits {
    public static int findDigits(int n) {
        char[] nArray = String.valueOf(n).toCharArray();
        int count = 0;
        for (int value : nArray)
            if ((value - '0' != 0) && (n % (value - '0') == 0))
                count++;
        return count;
    }
}
