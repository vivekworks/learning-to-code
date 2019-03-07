package warmup;


import java.util.ArrayList;
import java.util.Arrays;

public class ClimbingTheLeaderBoard {
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
//        ArrayList<Integer> scoreList = setInitialScores(scores, alice);
//        int[] steps = new int[alice.length];
//        for (int i = 0; i < alice.length; i++)
//            steps[i] = getPosition(alice[i], scoreList) + 1;
//        return steps;
        return setInitialScores(scores, alice);
    }

    private static int getPosition(int score, ArrayList<Integer> scoreList) {
        int high = scoreList.size() - 1;
        int low = 0;
        int middle = 0;
        while (high >= low) {
            middle = (high + low) / 2;
            if (score == scoreList.get(middle))
                return middle;
            else if (score < scoreList.get(middle))
                low = middle + 1;
            else if (score > scoreList.get(middle))
                high = middle - 1;
        }
        if (scoreList.get(middle) > score) {
            middle++;
            scoreList.add(middle, score);
        } else
            scoreList.add(middle, score);
        return middle;
    }

    private static int[] setInitialScores(int[] scores, int[] alice) {
        int sCount = 0;
        int aCount = 0;
        int dupe = -1;
        int rank = scores.length - 1;
        int[] steps = new int[alice.length];
        int prevValue = 0;
        int withoutDupe = 0;
        while (scores[scores.length - 1] > alice[aCount]) {
            steps[aCount++] = scores.length-1;
            withoutDupe++;
        }
        for (int i = scores.length - 1; i >= 0; i--) {
            int score = scores[i];
            if (score != prevValue) {
                while (alice[aCount] <= score) {
                    if (alice[aCount] < score) {
                        if (alice[aCount] > prevValue) {
                            steps[aCount++] = i + 1;
                        } else if (alice[aCount] == prevValue)
                            steps[aCount++] = i;
                    } else if (alice[aCount] == score) {
                        steps[aCount++] = i+1;
                    }
                }
                prevValue = score;
            } else {
                dupe++;
            }
        }
        System.out.println(Arrays.toString(steps));
        System.out.println(dupe+" : "+withoutDupe);
        for(int i=steps.length-1;i>=withoutDupe;i--) {
            steps[i] = steps[i] - dupe;
        }
        System.out.println(Arrays.toString(steps));
        for (int i = aCount; i < steps.length; i++)
            steps[i] = 1;
        return steps;
    }
}