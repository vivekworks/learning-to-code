package challenges;

public class BetweenTwoSets {
    public static int getTotalX(int[] a, int[] b) {
        int factor = 0,minValue=Integer.MAX_VALUE,result=0;
        boolean flagOne, flagTwo;
        for (int var : a) {
            if (var > factor)
                factor = var;
        }
        for(int var :b){
            if(minValue > var)
                minValue=var;
        }
        for(int i=factor;i<minValue+1;i++){
            flagOne=flagTwo=true;
            for(int var :b){
                if(var%i != 0)
                    flagOne=false;
            }
            if(flagOne) {
                for(int val :a) {
                    if(i%val !=0)
                        flagTwo=false;
                }
                if(flagTwo)
                    result++;
            }
        }
        return result;
    }
}
