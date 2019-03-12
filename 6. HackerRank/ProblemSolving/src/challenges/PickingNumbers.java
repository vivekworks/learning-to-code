package challenges;

import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int maxLength = 0;
        for (int i = 0; i < a.size(); i++) {
            int minTemp = 0, maxTemp = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) < a.get(j) && a.get(j) - a.get(i) <= 1)
                    maxTemp++;
                else if (a.get(i) >= a.get(j) && a.get(i) - a.get(j) <= 1)
                    minTemp++;
            }
            if (maxTemp > maxLength && maxTemp > minTemp)
                maxLength = maxTemp;
            else if (minTemp > maxLength && maxTemp < minTemp)
                maxLength = minTemp;
        }
        return maxLength;
    }
}
