package com.generics;

public class BoundsDemo {
    void showDemo(){
        Integer[] intNums = {1,2,3,4};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println(intStats.average());
        Double[] doubNums = {1.0,2.0,3.0,4.0};
        Stats<Double> doubStats=new Stats<>(doubNums);
        System.out.println(doubStats.average());
    }
}
