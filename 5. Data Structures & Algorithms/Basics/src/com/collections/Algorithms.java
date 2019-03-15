package com.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Algorithms {
    static void check(){
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Du Plessis");
        stringLinkedList.add("Dhoni");
        stringLinkedList.add("Watson");
        stringLinkedList.add("Rayudu");
        stringLinkedList.add("Billings");
        System.out.println(stringLinkedList);
        Comparator<String> stringComparator = Collections.reverseOrder();
        stringLinkedList.sort(stringComparator);
        System.out.println(stringLinkedList);
        Collections.shuffle(stringLinkedList);
        System.out.println(stringLinkedList);
        System.out.println(Collections.max(stringLinkedList)+" : "+Collections.min(stringLinkedList));
    }
}
