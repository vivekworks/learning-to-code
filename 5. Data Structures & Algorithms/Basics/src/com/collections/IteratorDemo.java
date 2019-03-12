package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    static void check(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("M");
        stringList.add("E");
        stringList.add("N");
        stringList.add("T");
        stringList.add("O");
        stringList.add("S");
        Iterator<String> stringIterator = stringList.iterator();
        while(stringIterator.hasNext())
            System.out.println(stringIterator.next());
        ListIterator<String> stringListIterator = stringList.listIterator();
        while(stringListIterator.hasNext()) {
            String next = stringListIterator.next();
            stringListIterator.set( next+"+");
        }
        while(stringListIterator.hasPrevious())
            System.out.println(stringListIterator.previous());
    }
}
