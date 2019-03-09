package warmup;

public class AngryProfessor {
    public static String angryProfessor(int k, int[] a) {
        int thresh=0;
        for(int time :a){
            if(time<=0)
                thresh++;
        }
        return thresh>=k ? "NO" : "YES";
    }
}
