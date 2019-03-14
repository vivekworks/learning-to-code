package com.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    static void check(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(4);
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(3,false,6,true));
    }

    static void checkComparator(){
        TreeSet<String> treeSet = new TreeSet<>(new MyComp<>().reversed());
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("F");
        treeSet.add("E");
        System.out.println(treeSet);
        treeSet = new TreeSet<>((v1,v2) -> v2.compareTo(v1));
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("F");
        treeSet.add("E");
        System.out.println(treeSet);
    }
}
