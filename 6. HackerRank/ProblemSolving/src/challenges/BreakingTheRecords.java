package challenges;

public class BreakingTheRecords {
    public static int[] breakingRecords(int[] scores) {
        int[] output=new int[2];
        int highScore=scores[0],lowScore=scores[0];
        for(int val :scores){
            if(highScore<val) {
                highScore=val;
                output[0]++;
            }
            if(lowScore>val) {
                lowScore=val;
                output[1]++;
            }
        }
        return output;
    }
}
