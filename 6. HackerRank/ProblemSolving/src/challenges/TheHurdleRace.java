package challenges;

public class TheHurdleRace {
    public static int hurdleRace(int k, int[] height) {
        int dosage = 0;
        for (int hurdle : height) {
            int newDiff = hurdle - k;
            if (newDiff > 0 && newDiff > dosage)
                dosage = newDiff;
        }
        return dosage;
    }
}