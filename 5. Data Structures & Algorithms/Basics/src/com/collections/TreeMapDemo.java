package com.collections;

import java.util.Comparator;
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

    static void doubleCheck(){
        TreeMap<String, Double> treeMap = new TreeMap<>(new TComp());
        treeMap.put("Steven Smith",13.8);
        treeMap.put("David Warner",4.4);
        treeMap.put("Joe Denly",2.45);
        treeMap.put("Eoin Morgan",55.5);
        treeMap.put("Craig Smith",54.8);
        System.out.println(treeMap);
    }

    static void tripleCheck(){
        TreeMap<String, Double> treeMap = new TreeMap<>(new CompareLastName().thenComparing(new CompareFirstName()));
        treeMap.put("Steven Smith",13.8);
        treeMap.put("David Warner",4.4);
        treeMap.put("Joe Denly",2.45);
        treeMap.put("Eoin Morgan",55.5);
        treeMap.put("Craig Smith",54.8);
        System.out.println(treeMap);
    }

    static void lambdaCheck(){
        Comparator<String> compLastName = (s1,s2) -> s1.substring(s1.lastIndexOf(' ')).compareToIgnoreCase(s2.substring(s2.lastIndexOf(' ')));
        Comparator<String> fullComp = compLastName.thenComparing((s1,s2) -> s1.compareToIgnoreCase(s2));
        TreeMap<String, Double> treeMap = new TreeMap<>(fullComp);
        treeMap.put("Craig Smith",54.8);
        treeMap.put("Steven Smith",13.8);
        treeMap.put("David Warner",4.4);
        treeMap.put("Joe Denly",2.45);
        treeMap.put("Eoin Morgan",55.5);
        System.out.println(treeMap);
    }
}
