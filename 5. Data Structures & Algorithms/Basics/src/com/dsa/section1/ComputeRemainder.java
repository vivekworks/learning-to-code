package com.dsa.section1;


public class ComputeRemainder {

    private static long computeRemainder(long base, long power, long divisor){
        long baseRaisedToPower =1;
        for (int i=1;i<=power;i++){
            baseRaisedToPower*=base;
        }
        return baseRaisedToPower%divisor;
    }

    private static long computeRemainderCorrected(long base, long power, long divisor){
        long baseRaisedToPower=1;
        for(int i=1;i<=power;i++){
            baseRaisedToPower*=base;
            baseRaisedToPower%=divisor;
        }
        return baseRaisedToPower;
    }

    private static long computeRemainderUsingEBS(long base, long power, long divisor){
        long baseRaisedToPower=1;
        long powerBitsReversed=0;
        int numBits=0;

        while(power > 0){
            powerBitsReversed <<= 1;
            powerBitsReversed += power & 1;
            power >>>= 1;
            numBits++;
        }

        while (numBits-- > 0){
            if(powerBitsReversed%2==1)
                baseRaisedToPower *= baseRaisedToPower*base;
            else
                baseRaisedToPower *= baseRaisedToPower;
            baseRaisedToPower%=divisor;
            powerBitsReversed>>>=1;
        }
        return baseRaisedToPower;
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis(),endTime;
        long ans =0;
        System.out.println("1. First Technique");
        for (int i=0;i<1000;i++){
            ans=computeRemainder(13,10000000,7);
        }
        endTime = System.currentTimeMillis();
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
        ans =0;
        startTime = System.currentTimeMillis();
        System.out.println("3. EBS Technique");
        for (int i=0;i<2;i++){
            ans=computeRemainderUsingEBS(13,2,7);
        }
        endTime = System.currentTimeMillis();
        System.out.println(ans);
        System.out.println(endTime-startTime);
    }
}
