package com.collections;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueDemo {
    static void check(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Alpha");
        priorityQueue.offer("Beta");
        priorityQueue.offer("Gamma");
        priorityQueue.offer("Omega");
        priorityQueue.offer("Epsilon");
        priorityQueue.offer("Upsilon");
        System.out.println(priorityQueue);
        String value = priorityQueue.poll();
        System.out.println(priorityQueue+" - "+value+" - "+priorityQueue.comparator());
        TreeSet treeSet = new TreeSet(priorityQueue);
        System.out.println(treeSet);
    }
}
