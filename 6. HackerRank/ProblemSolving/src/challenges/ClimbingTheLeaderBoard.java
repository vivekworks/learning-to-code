package challenges;

public class ClimbingTheLeaderBoard {
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] steps = new int[alice.length];
        int leaderCount = 0, stepCount = steps.length - 1;
        int previousValue = -1, previousAlice = -1;
        for (int i = 0; i < scores.length; i++) {
            if(stepCount<0)
                break;
            if (scores[i] != previousValue) {
                if (alice[stepCount] >= scores[i] && ((alice[stepCount] < previousAlice) || (previousAlice == -1))) {
                    previousAlice = alice[stepCount];
                    ++leaderCount;
                    steps[stepCount] = leaderCount;
                    --stepCount;
                    while(stepCount>=0) {
                        if(alice[stepCount] < scores[i])
                            break;
                        previousAlice = alice[stepCount];
                        steps[stepCount] = leaderCount;
                        --stepCount;
                    }
                } else {
                    ++leaderCount;
                }
            }
            previousValue = scores[i];
        }
        for(int i=stepCount;i>=0;i--)
            steps[i]=leaderCount+1;
        return steps;
    }
}