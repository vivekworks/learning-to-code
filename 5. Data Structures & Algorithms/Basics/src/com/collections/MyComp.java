package com.collections;

import java.util.Comparator;

public class MyComp<T extends String> implements Comparator<T> {
    public int compare(T t1,T t2){
        return t2.compareTo(t1);
    }
}
