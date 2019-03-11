package warmup;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExtraLongFactorials {
    //static BigDecimal factorialValue=BigDecimal.ONE;
    public static void extraLongFactorials(int n) {
        BigDecimal factorialValue = BigDecimal.ONE;
        for(int i=1;i<=n;i++)
            factorialValue=factorialValue.multiply(BigDecimal.valueOf(i));
        System.out.println(factorialValue);
    }

    /*public static void extraLongFactorials(int n) {
        if(n <= 1){
            factorialValue=factorialValue.multiply(BigDecimal.ONE);
            System.out.println(factorialValue);
        } else {
            factorialValue=factorialValue.multiply(BigDecimal.valueOf(n));
            extraLongFactorials(n-1);
        }
    }*/

}
