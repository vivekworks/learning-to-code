package com.lambda;

import java.util.function.Function;

public class BuiltInFunc {
    void main(){
        Function<Integer,Integer> funcVal = (n) -> {
            int j=1;
            for(int i=1;i<=n;i++)
                j*=i;
            return j;
        };
        System.out.println(funcVal.apply(5));
    }
}
