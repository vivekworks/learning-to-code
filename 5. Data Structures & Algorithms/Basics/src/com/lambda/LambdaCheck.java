package com.lambda;

public class LambdaCheck {
    void check(){
        MyNumber myNum;
        myNum = () -> 123;
        System.out.println(myNum.getValue());
        myNum = () -> Math.random()*100;
        System.out.println(myNum.getValue());
    }
}
