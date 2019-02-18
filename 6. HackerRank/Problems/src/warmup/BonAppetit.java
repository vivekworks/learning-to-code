package warmup;

import java.util.List;

public class BonAppetit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
        for(Integer val :bill)
            sum+=val;
        int bal=(sum-bill.get(k))/2;
        System.out.println(bal == b ? "Bon Appetit":String.valueOf(bal));
    }
}
