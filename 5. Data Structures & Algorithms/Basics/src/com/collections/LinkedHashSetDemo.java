package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    static void check(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        String s = "Man!";
        linkedHashSet.add("Hi");
        linkedHashSet.add("Hello");
        linkedHashSet.add("Con");
        linkedHashSet.add("Man!");
        linkedHashSet.add(s);
        System.out.println(linkedHashSet);
    }
}
