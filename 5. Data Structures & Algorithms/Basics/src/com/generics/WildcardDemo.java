package com.generics;

public class WildcardDemo {
    void showDemo(){
        Integer[] intArray = {1,2,3,4,5};
        Stats<Integer> intStats = new Stats<>(intArray);
        System.out.println("Int Stats : "+intStats.average());
        Double[] doubleArray={1.0,2.0,3.0,4.0,5.0};
        Stats<Double> doubleStats = new Stats<>(doubleArray);
        System.out.println("Double Stats : "+doubleStats.average());
        System.out.println(intStats.sameAvg(doubleStats));//Not possible when sameavg method takes Stats<T> parameter
    }
}
