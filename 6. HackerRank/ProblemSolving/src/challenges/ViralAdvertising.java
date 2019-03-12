package challenges;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        int shares=5,likes=2;
        for(int i=0;i<n-1;i++) {
            shares = ((shares / 2) * 3);
            likes=likes+(shares/2);
        }
        return likes;
    }
}
