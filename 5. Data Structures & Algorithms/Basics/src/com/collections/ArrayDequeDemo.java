package com.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    static void check(){
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("V");
        arrayDeque.push("I");
        arrayDeque.push("V");
        arrayDeque.push("E");
        arrayDeque.push("K");
        arrayDeque.offerFirst("T");
        arrayDeque.add("S");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peekFirst()+" : "+arrayDeque.peekLast());
        System.out.println(arrayDeque.pollFirst()+" : "+arrayDeque.pollLast());
        System.out.print("Stack popped : ");
        while(arrayDeque.peek() != null)
            System.out.print(arrayDeque.pop()+" ");
    }
}