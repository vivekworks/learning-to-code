package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void check(){
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(1,"Z");
        System.out.println("After adding "+arrayList.size());
        System.out.println("List "+arrayList);
        arrayList.remove("C");
        arrayList.remove(2);
        System.out.println("After adding "+arrayList.size());
        System.out.println("List "+arrayList);
        arrayList.ensureCapacity(50);
        System.out.println(arrayList.size());
        arrayList.trimToSize();
        System.out.println(arrayList.size());
        String[] stringy = new String[arrayList.size()];
        System.out.println(Arrays.toString(stringy));
        stringy = arrayList.toArray(stringy);
        stringy[0]="H";
        System.out.println(Arrays.toString(stringy));
    }
}
