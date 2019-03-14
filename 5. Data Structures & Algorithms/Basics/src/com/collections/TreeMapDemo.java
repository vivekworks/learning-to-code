package com.collections;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    static void check(){
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("A",13.8);
        treeMap.put("B",4.4);
        treeMap.put("D",2.45);
        treeMap.put("C",55.5);
        System.out.println(treeMap);
        long a = System.nanoTime();
        treeMap.get("B");
        long b = System.nanoTime();
        System.out.println((b-a));
        HashMap<String, Double> newHash = new HashMap<>(treeMap);
        a = System.nanoTime();
        newHash.get("B");
        b = System.nanoTime();
        System.out.println((b-a));
    }
}
