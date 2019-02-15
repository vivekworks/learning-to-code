package warmup;

import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int[] birds = new int[5];
        for (int val : arr) {
            switch (val) {
                case 1:
                    birds[0]++;
                    break;
                case 2:
                    birds[1]++;
                    break;
                case 3:
                    birds[2]++;
                    break;
                case 4:
                    birds[3]++;
                    break;
                case 5:
                    birds[4]++;
                    break;
            }
        }
        int result=1;
        int max=birds[0];
        for(int i=1;i<5;i++){
            if(max<birds[i]) {
                max=birds[i];
                result = i + 1;
            }
        }
        return result;
    }
}
