package com.collections;

import java.util.Comparator;

public class CompareFirstName implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
}
