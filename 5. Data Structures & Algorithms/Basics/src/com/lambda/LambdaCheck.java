package com.lambda;

public class LambdaCheck  {
    void check(){
        MyNumber myNum;
        myNum = n -> n%2==0;
        System.out.println(myNum.getValue(4));
        MyNumber diffNum = n -> n>=0;
        System.out.println(diffNum.getValue(-1));
        Factors fact1 = (a, b) -> a/b==0;
        System.out.println(fact1.test(2,10));
    }
}
