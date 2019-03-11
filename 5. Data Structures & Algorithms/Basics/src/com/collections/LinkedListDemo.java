package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void check(){
        LinkedList<Integer> linkedListDemo = new LinkedList<>();
        linkedListDemo.add(1);
        linkedListDemo.add(2);
        linkedListDemo.addLast(3);
        linkedListDemo.addFirst(4);
        System.out.println(linkedListDemo);
        linkedListDemo.remove(1);
        linkedListDemo.remove(Integer.parseInt("2"));
        System.out.println(linkedListDemo);
        linkedListDemo.removeFirst();
        System.out.println(linkedListDemo);
        linkedListDemo.removeLast();
        System.out.println(linkedListDemo);
        //linkedListDemo.set(3,3);
        System.out.println(linkedListDemo);
        //System.out.println(linkedListDemo.get(4));
        System.out.println(linkedListDemo);
    }
}
