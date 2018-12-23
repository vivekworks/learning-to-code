package com.dsa.section1;


public class ComputeRemainder {

    public static long computeRemainder(long base, long power, long divisor){
        long baseRaisedToPower =1;
        for (int i=1;i<=power;i++){
            baseRaisedToPower*=base;
        }
        return baseRaisedToPower%divisor;
    }

    public static long computeRemainderCorrected(long base, long power, long divisor){
        long baseRaisedToPower=1;
        for(int i=1;i<=power;i++){
            baseRaisedToPower*=base;
            baseRaisedToPower%=divisor;
        }
        return baseRaisedToPower;
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        long ans =0;
        System.out.println("1. First Technique");
        for (int i=0;i<1000;i++){
            ans=computeRemainder(13,10000000,7);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(ans);
        System.out.println(endTime-startTime);
        ans =0;
        startTime = System.currentTimeMillis();
        System.out.println("2. Second Technique");
        for (int i=0;i<1000;i++){
            ans=computeRemainderCorrected(13,10000000,7);
        }
        endTime = System.currentTimeMillis();
        System.out.println(ans);
        System.out.println(endTime-startTime);
    }
}
