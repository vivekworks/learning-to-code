package warmup;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ClimbingTheLeaderBoard {
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] steps = new int[alice.length];
        for (int i = 0; i < alice.length; i++){
            System.out.println(duplicateList(alice[i], scores));
            steps[i] = getPosition(alice[i], scores) - duplicateList(alice[i], scores);
        }
        return steps;
    }

    private static int getPosition(int score, int[] scores) {
        int high = scores.length - 1;
        int low = 0;
        int middle = 0;
        while (high >= low) {
            middle = (high + low) / 2;
            if (score == scores[middle])
                return middle;
            else if (score < scores[middle])
                low = middle + 1;
            else if (score > scores[middle])
                high = middle - 1;
        }
        if (scores[middle] > score)
            middle++;
        return middle;
    }

    private static int duplicateList(int score, int[] scores){
        System.out.println(score);
        List<?> a = Arrays.asList(scores);
        int count=0;
        while(true) {
            if (a.contains(score)){
                a.remove(a.indexOf(score));
                count++;
            } else{
                break;
            }
        }
        return count;
    }
}