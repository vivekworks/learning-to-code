package com.collections;

import java.util.HashSet;

public class HashSetDemo {
    static void check(){
        HashSet<String> hashSet = new HashSet<>();
        String s = "Man!";
        System.out.println(hashSet.add("Hi"));
        System.out.println(hashSet.add("Hello"));
        System.out.println(hashSet.add(s));
        System.out.println(hashSet.add(s));//false - Doesn't allow duplicates
        System.out.println(hashSet.add("Hello"));//false - Doesn't allow duplicates
        System.out.println(hashSet);
    }
}
