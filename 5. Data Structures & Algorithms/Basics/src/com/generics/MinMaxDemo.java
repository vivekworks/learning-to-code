package com.generics;

public class MinMaxDemo {
    void showDemo(){
        Integer[] intNums = {1,2,3,4};
        String[] strStrings = {"a","b","c","d","e"};
        MinMax<Integer> minMaxInt = new MinMax<>(intNums);
        MinMax<String> minMaxStr = new MinMax<>(strStrings);
        System.out.println(minMaxInt.min()+" : "+minMaxInt.max());
        System.out.println(minMaxStr.min()+" : "+minMaxStr.max());
    }
}
