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
}
