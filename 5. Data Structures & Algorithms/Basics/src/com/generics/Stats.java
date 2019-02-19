package com.generics;


public class Stats<T extends Number> {
    T[] nums;
    Stats(T[] nums){
        this.nums=nums;
    }
    double average(){
        double sum=0;
        for(T val :nums)
            sum+=val.doubleValue();//Gives error with only T in declaration
        return sum;
    }
    boolean sameAvg(Stats<?> statsOb){
        if(average() == statsOb.average())
            return true;
        return false;
    }
}
